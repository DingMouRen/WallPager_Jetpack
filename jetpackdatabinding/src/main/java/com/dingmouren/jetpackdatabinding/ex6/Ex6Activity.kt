package com.dingmouren.jetpackdatabinding.ex6

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx6Binding

class Ex6Activity : AppCompatActivity() {
    var ex6 = Ex6Model()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex6)
        val binding:ActivityEx6Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex6)

        ex6.name = "小红"
        ex6.age = 18

        binding.ex6Activity = this
    }

    fun onClick(view:View){
        ex6.age = ex6.age + 1
    }


}