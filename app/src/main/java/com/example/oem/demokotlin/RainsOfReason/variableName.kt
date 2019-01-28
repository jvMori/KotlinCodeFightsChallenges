package com.example.oem.demokotlin.RainsOfReason

import java.util.regex.Pattern

//Correct variable names consist only of English letters,
// digits and underscores and they can't start with a digit.

fun variableName(name: String): Boolean {
    val p = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_]*")
    val m = p.matcher(name)
    return m.matches()
}