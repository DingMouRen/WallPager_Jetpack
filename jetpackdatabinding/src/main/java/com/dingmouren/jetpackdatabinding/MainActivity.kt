package com.dingmouren.jetpackdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.databinding.ActivityMainBinding
import com.dingmouren.jetpackdatabinding.ex1.Ex1Activity
import com.dingmouren.jetpackdatabinding.ex2.Ex2Activity
import com.dingmouren.jetpackdatabinding.ex3.Ex3Activity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn1.setOnClickListener { startActivity(Intent(this, Ex1Activity::class.java)) }
        binding.btn2.setOnClickListener { startActivity(Intent(this, Ex2Activity::class.java)) }
        binding.btn3.setOnClickListener { startActivity(Intent(this, Ex3Activity::class.java)) }
    }
}
