package com.example.oem.demokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.oem.demokotlin.ExploringtheWaters.PalindromeRearranging

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val palindromeRearranging = PalindromeRearranging()
        palindromeRearranging.palindromeRearranging("abba")
    }

}
