// KT-15792 and related

fun foo() {
    var x: String? = ""
    val y = x
    x = null
    if (y != null) {
        <!DEBUG_INFO_CONSTANT!>x<!><!UNSAFE_CALL!>.<!>hashCode()
    }
}

fun bar(s: String?) {
    var ss = s
    val hashCode = ss?.hashCode()
    ss = null
    if (hashCode != null) {
        <!DEBUG_INFO_CONSTANT!>ss<!><!UNSAFE_CALL!>.<!>hashCode()
    }
}

class Some(var s: String?)

fun baz(arg: Some?) {
    val ss = arg?.s
    if (ss != null) {
        <!DEBUG_INFO_SMARTCAST!>arg<!>.hashCode()
        <!SMARTCAST_IMPOSSIBLE!><!DEBUG_INFO_SMARTCAST!>arg<!>.s<!>.hashCode()
    }
}
