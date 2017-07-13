package ro.kreator

class CyclicException : Throwable("Illegal cyclic dependency")
class CreationException(message : String, cause: Throwable?): Exception(message, cause)
