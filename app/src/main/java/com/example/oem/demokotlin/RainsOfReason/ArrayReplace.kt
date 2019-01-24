package com.example.oem.demokotlin.RainsOfReason

fun arrayReplace(inputArray: MutableList<Int>, elemToReplace: Int, substitutionElem: Int): MutableList<Int> {
    return inputArray.map { if (it == elemToReplace) substitutionElem else it }.toMutableList()

}