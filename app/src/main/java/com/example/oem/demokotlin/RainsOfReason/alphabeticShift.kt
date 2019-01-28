package com.example.oem.demokotlin.RainsOfReason

fun alphabeticShift(inputString: String): String =
    inputString.toCharArray()
        .map { char ->
            if (char != 'z')
                char.toInt() + 1
            else
                'a'.toInt()
        }.map { it.toChar() }.joinToString("")

