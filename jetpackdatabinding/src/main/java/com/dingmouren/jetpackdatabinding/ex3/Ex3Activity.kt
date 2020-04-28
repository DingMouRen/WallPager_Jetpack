package com.dingmouren.jetpackdatabinding.ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx3Binding

class Ex3Activity : AppCompatActivity() {

    private var ex3 = Ex3Model(
        ObservableField("小红"),
        ObservableField(16)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEx3Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex3)
        binding.ex3 = ex3
    }

    fun onClick(view:View){


        when(view.id){
            R.id.btn_1 -> ex3.name.set("小明")
            R.id.btn_2 -> ex3.age.set(ex3.age.get()!!.plus(1))
        }
    }
}
