// "Make 'A' abstract" "false"
// ERROR: Class 'X' must override public open fun foo(): Unit defined in X because it inherits many implementations of it
// ERROR: Delegated member 'fun foo(): Unit' hides supertype override: public open fun foo(): Unit defined in E. Please specify proper override explicitly
// ACTION: Create test
// ACTION: Make internal
// ACTION: Make private
// ACTION: Move 'X' to separate file

interface D {
    fun foo()
}

interface E {
    fun foo() {}
}

object Impl : D, E {
    override fun foo() {}
}

<caret>class X : D by Impl, E by Impl {}