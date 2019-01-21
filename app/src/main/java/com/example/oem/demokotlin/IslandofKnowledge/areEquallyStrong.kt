package com.example.oem.demokotlin.IslandofKnowledge

class AreEquallyStrong{
    fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
        val you  = listOf(yourLeft, yourRight)
        val friend = listOf(friendsLeft, friendsRight)

        return (you.max() == friend.max() && you.min() == friend.min())
    }
}
