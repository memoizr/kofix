package ro.kreator

import ro.kreator.CreationLogic.hash
import ro.kreator.CreationLogic.with
import kotlin.reflect.*
import kotlin.reflect.full.createType
import kotlin.reflect.full.starProjectedType
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.jvmErasure

//fun forAll(numberOfRuns: Int = 100, block: PropertyBased.() -> Unit) {
//    CreationLogic
//    val currentMethod = Thread.currentThread().stackTrace[2]
//    val map = mutableMapOf<KType, Int>()
//    fun Int.times(blk: (Int) -> Unit) = (1..this).forEach(blk)
//
//    numberOfRuns.times { Property(currentMethod.methodName.hash with it.hash, map).block() }
//}

//internal class Property(token: Token, countOfInvocations: MutableMap<KType, Int>) : PropertyBased(token, countOfInvocations)

open class PropertyBased(val token: Token, val countOfInvocations: MutableMap<KType, Int>) : Reify() {

    inline fun <reified T> a(): T {
        val type = typeOf<T>()
        countOfInvocations[type] = countOfInvocations[type]?.inc() ?: 1
        return instantiateRandomClass(type, _VirtualKProperty, token).let {
            return it as T
        }
    }
    inline fun <reified T> any(): T = a()
    inline fun <reified T> an(): T = a()

//    fun KType.store() = this.apply {
//        countOfInvocations[this]?.let { countOfInvocations[this] = it.inc() } ?: { countOfInvocations[this] = 0 }()
//    }
//
//    fun KType.tokenize(token: Token) = token with (countOfInvocations[this]?.hash ?: 0)
//
//    inline fun <reified T : Any> a(): T {
//        val type = T::class().type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//
//    inline fun <reified T : Any> an(): T = a<T>()
//
//    inline fun <reified T : Any> any(): T = a<T>()
//
//    inline fun <reified T : Any> a(t: TypedKType<*>): T {
//        val type = T::class(t).type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//    inline fun <reified T : Any> a(t: TypedKType<*>, t2: TypedKType<*>): T {
//        val type = T::class(t, t2).type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//    inline fun <reified T : Any> a(t: TypedKType<*>, t2: TypedKType<*>, t3: TypedKType<*>): T {
//        val type = T::class(t, t2, t3).type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//    inline fun <reified T : Any> a(t: TypedKType<*>, t2: TypedKType<*>, t3: TypedKType<*>, t4: TypedKType<*>): T {
//        val type = T::class(t, t2, t3, t4).type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//    inline fun <reified T : Any> a(t: TypedKType<*>, t2: TypedKType<*>, t3: TypedKType<*>, t4: TypedKType<*>, t5: TypedKType<*>): T {
//        val type = T::class(t, t2, t3, t4, t5).type.store()
//        return new(type, type.tokenize(token), null)
//    }
//
//    fun <A> new(type: KType, token: Token, kProperty: KProperty<*>?): A {
//        return instantiateRandomClass(type, kProperty, token.hash with type.hash) as A
//    }
}

data class TypedKType<T : Any>(val t: KClass<T>, val type: KType)

abstract class Reify {
    inline operator fun <reified T : Any> KClass<out T>.invoke(vararg types: TypedKType<*>): TypedKType<T> =
            TypedKType(T::class, this.createType(
                    types.zip(this.typeParameters.map { it.variance })
                            .map { KTypeProjection(it.second, it.first.type) }
            ))
}

class Creator(val type: KType, token: Token, val property: KProperty<*>?) : PropertyBased(token, mutableMapOf()) {


    fun <R : Any> getConstructor(klass: KClass<R>) = klass.constructors.filter { !it.parameters.any { (it.type.jvmErasure == klass) } }.toList()

    fun getParameters(type: KType, vararg classes: KClass<*>): List<KType> {
        val klass = type.jvmErasure
        val generics = type.arguments.map { it.type }
        val constructors = getConstructor(klass)
        if (constructors.isEmpty() && klass.constructors.any { it.parameters.any { (it.type.jvmErasure == klass) } }) throw CyclicException()
        val defaultConstructor: KFunction<*> = constructors.filter {
            it.parameters.size == classes.size &&
                    it.parameters
                            .zip(classes)
                            .all {
                                it.first.type.jvmErasure == it.second ||
                                        it.first.type.jvmErasure.java.isAssignableFrom(it.second.java)
                            }
        }.first()
        defaultConstructor.isAccessible = true
        val constructorParameters = defaultConstructor.parameters.map { it.type }.map { param ->
            if (param.jvmErasure == Any::class) {
                generics[defaultConstructor.typeParameters.map { it.name }.indexOf(param.classifier?.starProjectedType.toString())]!!
            } else {
                param
            }
        }
        return constructorParameters
    }
}
