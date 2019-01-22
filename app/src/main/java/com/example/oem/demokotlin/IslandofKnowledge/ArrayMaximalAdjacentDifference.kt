package com.example.oem.demokotlin.IslandofKnowledge

class ArrayMaximalAdjacentDifference{
    fun arrayMaximalAdjacentDifference(inputArray: MutableList<Int>): Int {
        var maxValue = -100000000
        for ( index in inputArray.indices){
            if (index + 1 < inputArray.size){
                val value = Math.abs(inputArray[index+1]- inputArray[index])
                if (value > maxValue)
                    maxValue = value
            }
        }

        return maxValue
    }
}