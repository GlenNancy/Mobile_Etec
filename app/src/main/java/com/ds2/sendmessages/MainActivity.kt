package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sandMessage(view : View) {
        val textMessage = findViewById<EditText>(R.id.TextMessages)
/*      val displayMessage = findViewById<TextView>(R.id.displayMessages)
        displayMessage.text = textMessage.text;
        Essas linhas mostram o valor de displatmessage na propria div. removida pois iremos mostrar o valor na proxima activit*/

        val message = textMessage.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply { putExtra(EXTRA_MESSAGE, message) }
        startActivity(intent)
    }
}