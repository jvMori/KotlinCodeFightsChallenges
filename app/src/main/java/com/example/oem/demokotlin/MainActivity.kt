package com.example.oem.demokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oem.demokotlin.ExploringtheWaters.PalindromeRearranging
import com.example.oem.demokotlin.InterviewPractice.Arrays.firstNorRepeating
import com.example.oem.demokotlin.InterviewPractice.Arrays.rotateImage
import com.example.oem.demokotlin.IntroGates.LateRide
import com.example.oem.demokotlin.IslandofKnowledge.isIPv4Address

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val palindromeRearranging = PalindromeRearranging()
        palindromeRearranging.palindromeRearranging("abba")
        isIPv4Address.isIPv4Address(".254.255.0")
        firstNorRepeating.firstNotRepeatingCharacter("abacabaabacaba")
        val value=  LateRide.lateRide(808)
    }

}
