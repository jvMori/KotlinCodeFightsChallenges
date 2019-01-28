package com.example.oem.demokotlin.RainsOfReason

import java.util.regex.Pattern

fun variableName(name: String): Boolean {
    val p = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_]*")
    val m = p.matcher(name)
    return m.matches()
}