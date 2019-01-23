package com.example.oem.demokotlin.IslandofKnowledge

class isIPv4Address {
    companion object {
        fun  isIPv4Address(inputString: String): Boolean {
            val array = inputString.split(".")
            if (array.size != 4) return false
            array.forEach { el ->
                val number = el.toIntOrNull()
                if (number == null || number > 255)
                    return false
            }
            return true
        }

        fun isIPv4AddressOtherSolution(inputString: String): Boolean {
            val tokens = inputString.split(".")
            return tokens.size == 4 && tokens.all { it.toIntOrNull() in 0..255 }
        }
    }
}