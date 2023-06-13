package ro.kreator

import ro.kreator.CreationLogic.ObjectFactory
import kotlin.reflect.KType
import kotlin.reflect.typeOf

inline fun <reified T> customize(noinline constructorBlock: Creator.() -> T): Customization<T> {
    val type = typeOf<T>()
    return Customization(type, constructorBlock)
}

class Customization<T>(
    val type: KType,
    val constructorBlock: Creator.() -> T
) {

    init {
        ObjectFactory[type] = { _, _, kproperty, token ->
            val creator = Creator(type, token, kproperty)
            constructorBlock(creator) as Any
        }
    }
}
