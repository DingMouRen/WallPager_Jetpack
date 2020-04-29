package com.dingmouren.jetpackdatabinding.ex9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx9Binding

class Ex9Activity : AppCompatActivity() {
    private var binding:ActivityEx9Binding? = null
    private var dataList:MutableList<Ex9Model>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex9)

        dataList = initDataList()

        binding?.recycler?.layoutManager = LinearLayoutManager(this)
        binding?.recycler?.adapter = Ex9Adapter(dataList!!)

    }

    private fun initDataList(): MutableList<Ex9Model> {
        val dataList = mutableListOf<Ex9Model>()
            for (i in 1..20){
                var ex9 = Ex9Model()
                ex9.name.set("小红 $i 号")
                ex9.age.set(16+i)
                dataList.add(ex9)
            }
        return dataList
    }

    fun onClick(view:View){
        dataList!![0].name.set("小明")
        dataList!![0].age.set(18)
    }
}
