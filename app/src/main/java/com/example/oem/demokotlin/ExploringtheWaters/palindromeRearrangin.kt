package com.example.oem.demokotlin.ExploringtheWaters

class PalindromeRearranging{
    fun palindromeRearranging(inputString: String): Boolean {
        val set = inputString.toCharArray().distinct()
        val filtered =  set.filter { c ->
            inputString.count { it == c  } % 2 == 1}

        return filtered.size < 2
    }
}
