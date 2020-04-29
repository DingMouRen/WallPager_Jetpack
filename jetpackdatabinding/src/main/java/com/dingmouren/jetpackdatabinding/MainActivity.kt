package com.dingmouren.jetpackdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.databinding.ActivityMainBinding
import com.dingmouren.jetpackdatabinding.ex1.Ex1Activity
import com.dingmouren.jetpackdatabinding.ex2.Ex2Activity
import com.dingmouren.jetpackdatabinding.ex3.Ex3Activity
import com.dingmouren.jetpackdatabinding.ex4.Ex4Activity
import com.dingmouren.jetpackdatabinding.ex5.Ex5Activity
import com.dingmouren.jetpackdatabinding.ex6.Ex6Activity
import com.dingmouren.jetpackdatabinding.ex7.Ex7Activity
import com.dingmouren.jetpackdatabinding.ex8.Ex8Activity
import com.dingmouren.jetpackdatabinding.ex9.Ex9Activity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn1.setOnClickListener { startActivity(Intent(this, Ex1Activity::class.java)) }
        binding.btn2.setOnClickListener { startActivity(Intent(this, Ex2Activity::class.java)) }
        binding.btn3.setOnClickListener { startActivity(Intent(this, Ex3Activity::class.java)) }
        binding.btn4.setOnClickListener { startActivity(Intent(this, Ex4Activity::class.java)) }
        binding.btn5.setOnClickListener { startActivity(Intent(this, Ex5Activity::class.java)) }
        binding.btn6.setOnClickListener { startActivity(Intent(this, Ex6Activity::class.java)) }
        binding.btn7.setOnClickListener { startActivity(Intent(this, Ex7Activity::class.java)) }
        binding.btn8.setOnClickListener { startActivity(Intent(this, Ex8Activity::class.java)) }
        binding.btn9.setOnClickListener { startActivity(Intent(this, Ex9Activity::class.java)) }
    }
}
