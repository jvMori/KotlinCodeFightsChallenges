package com.example.oem.demokotlin.ExploringtheWaters

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    var s1  : MutableSet<Int> = mutableSetOf()
    var s2 : MutableSet<Int> = mutableSetOf()
    var c = 0

    for (i in a.indices ){
        if (a[i] != b[i]){
            c++
            s1.add(a[i])
            s2.add(b[i])
        }
    }

    if (c == 0) return true
    if (c == 2 && s1.equals(s2)) return true

    return false
}
