package com.example.gooner10.myactivity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {
    /**
     * Declaring static final variables in kotlin
     */
    companion object {
        // Class name for Log tag
        private val LOG_TAG = FirstActivity::class.java.simpleName
        // Unique tag required for the intent extra
        val EXTRA_MESSAGE = "EXTRA_MESSAGE"
        // Unique tag for the intent reply
        val TEXT_REQUEST = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Button clicked!")

        val intent = Intent(this, SecondActivity::class.java)
        val message = editText_main!!.text.toString()

        intent.putExtra(EXTRA_MESSAGE, message)
        startActivityForResult(intent, TEXT_REQUEST)
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)

        // Test for the right intent reply
        if (requestCode == TEXT_REQUEST) {
            // Test to make sure the intent reply result was good.
            if (resultCode == Activity.RESULT_OK) {
                val reply = data.getStringExtra(SecondActivity.EXTRA_REPLY)

                // Make the reply head visible.
                text_header_reply!!.visibility = View.VISIBLE

                // Set the reply and make it visible.
                text_message_reply!!.text = reply
                text_message_reply!!.visibility = View.VISIBLE
            }
        }
    }


}
