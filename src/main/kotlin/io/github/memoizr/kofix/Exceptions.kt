package io.github.memoizr.kofix

class CyclicException : Throwable("Illegal cyclic dependency")
class CreationException(message : String, cause: Throwable?): Exception(message, cause)
