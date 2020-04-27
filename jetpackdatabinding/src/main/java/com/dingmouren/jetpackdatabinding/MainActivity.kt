package com.dingmouren.jetpackdatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.databinding.ActivityMainBinding
import com.dingmouren.jetpackdatabinding.model.Student
import com.dingmouren.jetpackdatabinding.ui.Ex1Activity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn1.setOnClickListener { startActivity(Intent(this,Ex1Activity::class.java)) }
    }
}
