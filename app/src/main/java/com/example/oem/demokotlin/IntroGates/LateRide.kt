package com.example.oem.demokotlin.IntroGates

class LateRide
{
    companion object {
        fun lateRide(n: Int): Int {
            val hours: Int = n / 60
            val minutes: Int = n - (hours * 60)
            val string = hours.toString() + minutes.toString()
            val arr = string.map { it.toString().toInt() }.toIntArray()
            return arr.sum()
        }

        fun lateRideOther(n: Int): Int {
            val h = n/60
            val m =  n%60
            return (h.toString()+m.toString()).sumBy { it.toString().toInt() }
        }

    }
}