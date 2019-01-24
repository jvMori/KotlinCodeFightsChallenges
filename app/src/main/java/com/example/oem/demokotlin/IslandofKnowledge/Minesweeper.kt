package com.example.oem.demokotlin.IslandofKnowledge

class Minesweeper
{
    fun minesweeper(matrix: MutableList<MutableList<Boolean>>): MutableList<MutableList<Int>> =
        (matrix.indices)
            .map { row -> matrix[0].indices
                .map { col -> (-1..1)
                    .sumBy { x -> (-1..1)
                        .sumBy { y -> if (!(x == y && x == 0) && matrix.getOrNull(row + x)?.getOrNull(col + y) == true) 1 else 0 } }
                }.toMutableList()
            }.toMutableList()
}