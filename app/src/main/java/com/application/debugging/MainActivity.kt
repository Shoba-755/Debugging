package com.application.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        second()
        first()
    }
    fun logging(){
        Log.v(TAG,"Hello World!")
        Log.w(TAG,"WARN: warns about the potential for serious errors")
        Log.e(TAG,"Error: a serious error like an app crash")
        Log.i(TAG,"INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG,"DEBUG: reporting technical information useful for debugging")
        Log.v(TAG,"VERBOSE: more verbose than DEBUG logs")
    }
    fun division(){
        val numerator = 60
        var denominator = 4
        repeat(5){
            Log.v(TAG,"${numerator/denominator}")
            denominator--
        }
    }
    val TAG = "MainActivity"

    fun first() {
        second()
        Log.v(TAG, "1")
    }

    fun second() {
        third()
        Log.v(TAG, "2")
        fourth()
    }

    fun third() {
        Log.v(TAG, "3")
    }

    fun fourth() {
        Log.v(TAG, "4")
    }
}