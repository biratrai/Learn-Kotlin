package nepalphoto.gooner10.com.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloKotlin = "Hello Kotlin!"

        displayHelloKotlin(helloKotlin)
    }

    private fun displayHelloKotlin(helloKotlin: String) {
        hello_kotlin.text = helloKotlin
    }

}
