package com.ds2.sendmessages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val displayMessageText = findViewById<TextView>(R.id.displayMessageText)
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        //displayMessageText.text = message
        displayMessageText.apply { text = message }
    }
}