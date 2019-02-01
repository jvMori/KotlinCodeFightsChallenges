package com.example.oem.demokotlin.InterviewPractice.Arrays

class rotateImage
{
    companion object {
        fun rotateImage(matrix: List<List<Int>>): List<List<Int>> {
            return (0 until matrix.size).map { column ->
                (matrix.size - 1 downTo 0).map { row ->
                    matrix[row][column]
                }
            }.toList()
        }
    }
}