package com.dingmouren.jetpackdatabinding.ex5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableArrayList
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx5Binding

class Ex5Activity : AppCompatActivity() {

    var data = ObservableArrayList<Any>().apply {
        add("小猫咪")
        add(18)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEx5Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex5)
        binding.ex5Activity = this
    }

    fun onClick(view:View){
        when(view.id){
            R.id.btn_1 -> data[0] = "小狗狗"
            R.id.btn_2 -> data[1] = 20
            else -> ""
        }
    }


}
