fun test(d: dynamic) {
    val a = arrayOf(1, 2, 3)

    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>d)
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a)
    d.foo(1, "2", <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a)
    d.foo(1, <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a) { }
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a) { "" }
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a)
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a) { "" }
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, 1, { "" }, <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a)
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, 1)
    d.foo(<!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, <!SPREAD_OPERATOR_IN_DYNAMIC_CALL!>*<!>a, { "" })
}