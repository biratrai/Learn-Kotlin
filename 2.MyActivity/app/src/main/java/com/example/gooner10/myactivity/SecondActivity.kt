package com.example.gooner10.myactivity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.gooner10.myactivity.FirstActivity.Companion.EXTRA_MESSAGE
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    /**
     * Declaring static final variables in kotlin
     */
    companion object {
        // Unique tag for the intent reply.
        val EXTRA_REPLY = "EXTRA_REPLY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the intent that launched this activity, and the message in
        // the intent extra.
        val intent = intent
        var message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE)

        if (savedInstanceState != null) {
            val reply = savedInstanceState.getString(EXTRA_REPLY)
            editText_second.setText(reply)
            message = savedInstanceState.getString(EXTRA_MESSAGE)
        }
        // Put that message into the text_message TextView
        text_message.text = message
    }

    fun returnReply(view: View) {
        // Get the reply message from the edit text.
        val reply = editText_second.text.toString()

        // Create a new intent for the reply, add the reply message to it as an extra,
        // set the intent result, and close the activity.
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(Activity.RESULT_OK, replyIntent)
        finish()
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        if (outState != null) {
            outState.putString(EXTRA_REPLY, editText_second.text.toString())
            outState.putString(EXTRA_MESSAGE, text_message.text.toString())
        }
    }
}
