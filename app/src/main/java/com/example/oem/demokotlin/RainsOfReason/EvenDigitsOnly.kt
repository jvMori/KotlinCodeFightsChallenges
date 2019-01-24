package com.example.oem.demokotlin.RainsOfReason

fun evenDigitsOnly(n: Int): Boolean =
    n.toString().toCharArray().all{ it.toInt() % 2 == 0}

