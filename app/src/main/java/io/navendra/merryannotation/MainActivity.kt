package io.navendra.merryannotation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.navendra.annotation.GreetingGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    @GreetingGenerator
    class Santa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = greetingView
        textView.text = Generated_Santa().greeting()
    }


}
