package com.dingmouren.jetpacklifecycle.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dingmouren.jetpacklifecycle.R
import kotlinx.android.synthetic.main.activity_ex1.*
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder


class Ex1Activity : AppCompatActivity() {
    private val tag = this.javaClass.simpleName
    private var stringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        lifecycle.addObserver(Ex1LifecycleObserver(stringBuilder,tv))


        stringBuilder.append(tag + "--onCreate\n")
    }

    override fun onStart() {
        super.onStart()
        stringBuilder.append(tag + "--onStart\n")
    }

    override fun onResume() {
        super.onResume()
        stringBuilder.append(tag + "--onResume\n")
    }

    override fun onPause() {
        super.onPause()
        stringBuilder.append(tag + "--onPause\n")
    }

    override fun onStop() {
        super.onStop()
        stringBuilder.append(tag + "--onStop\n")
    }

    override fun onDestroy() {
        super.onDestroy()
        stringBuilder.append(tag + "--onDestroy\n")
    }
}
