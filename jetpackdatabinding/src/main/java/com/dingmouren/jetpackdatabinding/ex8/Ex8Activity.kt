package com.dingmouren.jetpackdatabinding.ex8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx8Binding

class Ex8Activity : AppCompatActivity() {

    private var ex8 = Ex8Model()
    private var binding:ActivityEx8Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex8)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex8)

        ex8.name = "小明"

        binding?.ex8 = ex8
    }

    fun onClick(view: View){
        binding?.tvName?.text = ex8.toString()
    }
}
