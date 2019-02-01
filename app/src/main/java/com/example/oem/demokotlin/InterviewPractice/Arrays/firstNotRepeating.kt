package com.example.oem.demokotlin.InterviewPractice.Arrays

class firstNorRepeating{
    companion object {
        fun firstNotRepeatingCharacter(s: String): Char {
            val set = mutableSetOf<Char>()
            val array = s.toCharArray()

            array.forEachIndexed { index, el ->
                array[index] = ' '
                if (!array.contains(el)) set.add(el)
                array[index] = el
            }
            if (set.isNotEmpty())
                return  set.first()
            else
                return '_'
        }

        fun firstNotRepeatingCharacterOther(s: String): Char {
            s.forEachIndexed { i, c ->  if(i == s.lastIndexOf(c) && i == s.indexOf(c)) return c }
            return '_'
        }

        fun firstNotRepeatingCharacterOtherSol(s: String): Char =
            s.groupingBy { it }.eachCount()
                .filter { it.value == 1 }
                .toList()
                .firstOrNull()?.first ?: '_'
    }

}
