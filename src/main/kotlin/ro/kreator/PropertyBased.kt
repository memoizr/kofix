package ro.kreator

import ro.kreator.CreationLogic.hash
import ro.kreator.CreationLogic.with
import ro.kreator.PropertyBased.countOfInvocations
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

object PropertyBased{
    val countOfInvocations: MutableMap<KType, Long> = mutableMapOf()

}

inline fun <reified T> a(): T {
    val type = typeOf<T>()
    countOfInvocations[type] = countOfInvocations[type]?.inc() ?: 1
    return instantiateRandomClass(type, _VirtualKProperty, type.hashCode().toLong() + (countOfInvocations[type] ?: 0)).let {
        return it as T
    }
}

inline fun <reified T> any(): T = a()
inline fun <reified T> an(): T = a()
