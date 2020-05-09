package com.dingmouren.jetpackviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dingmouren.jetpackviewmodel.ex1.Ex1Activity
import com.dingmouren.jetpackviewmodel.ex2.Ex2Activity
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_1.setOnClickListener { startActivity(Intent(this,Ex1Activity::class.java)) }
        btn_2.setOnClickListener { startActivity(Intent(this,Ex2Activity::class.java)) }
    }
}
