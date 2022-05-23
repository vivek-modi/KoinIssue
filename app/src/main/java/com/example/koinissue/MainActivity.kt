package com.example.koinissue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.vmodi.library.TimePass
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    private val timepass by inject<TimePass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        timepass.message()
    }
}