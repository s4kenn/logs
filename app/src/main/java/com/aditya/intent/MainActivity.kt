package com.aditya.intent

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {

            Log.v(TAG,"Verbose log: lowest priority, detailed entry, no use during production")
            Log.d(TAG,"Debug log: highest priority, This is used to debug the app")
            Log.i(TAG,"Info log: moderate level importance, they give information of content")
            Log.w(TAG,"Warning log: This is a warning message for unexpected behaviour")

        }


    }
}