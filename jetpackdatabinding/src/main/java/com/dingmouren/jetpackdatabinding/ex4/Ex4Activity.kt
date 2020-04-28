package com.dingmouren.jetpackdatabinding.ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayMap
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx4Binding


class Ex4Activity : AppCompatActivity() {

    private val ex4 = Ex4Model(ObservableArrayMap<String,Any>().apply {
        put("name","小红")
        put("age",16)
    })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEx4Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex4)
        binding.ex4 = ex4
    }

    fun onClick(view:View){

        when(view.id){
            R.id.btn_1 -> ex4.map["name"] = "小明"
            R.id.btn_2 -> ex4.map["age"]  = (ex4.map["age"] as Int) + 1
            else -> ""
        }
    }
}
