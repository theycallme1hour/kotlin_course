package com.example

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.work.R


class MainActivity : AppCompatActivity() {
    var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(tag: "MyLog", mgs "OnCreate")
    }
    override fun onStart() {
super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        counter = 5+6
        counter = 40+45
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    class
}