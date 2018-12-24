package io.navendra.helloannotation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.navendra.annotation.GreetingGenerator

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    @GreetingGenerator
    class Hello

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.d(TAG,"Hello ${Generated_Hello().greeting}")
    }


}
