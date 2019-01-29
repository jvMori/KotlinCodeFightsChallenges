package com.example.oem.demokotlin.InterviewPractice

fun firstDuplicateSlow(a: MutableList<Int>): Int {
    var min = 100000000
    a.forEachIndexed{ index, el ->
        for (i in index + 1 until a.size) {
            if (el == a[i] && i < min) {
                min = i
            }
        }
    }
    if (min < a.size)
        return a[min]

    return -1
}

fun firstDuplicate(a: MutableList<Int>): Int {
    val set = mutableSetOf<Int>()
    for (value in a){
        if (set.contains(value))
            return value
        else
            set.add(value)
    }
    return -1
}