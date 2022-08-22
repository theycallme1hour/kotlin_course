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
        var tag = null
        Log.d(tag: "MyLog", mgs "OnCreate1")
        Log.d(tag: "MyLog", mgs "OnCreate2")
    }
    override fun onStart() {
super.onStart()
        var tag = null
        Log.d(tag: "MyLog",mgs "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag: "MyLog",mgs "OnResume")
    }

    override fun onPause() {
        super.onPause()
        counter = 5+6
        counter = 40+45
        var tag = null
        Log.d(tag: "MyLog", mgs "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

}