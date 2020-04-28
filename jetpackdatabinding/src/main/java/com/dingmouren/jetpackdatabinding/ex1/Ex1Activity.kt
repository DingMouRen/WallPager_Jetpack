package com.dingmouren.jetpackdatabinding.ex1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx1Binding

/***
 * 基础入门
 */
class Ex1Activity : AppCompatActivity() {

    private var binding:ActivityEx1Binding? = null
    private var stu: Ex1Model? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex1)

        //创建数据model:Student
        stu = Ex1Model("小红", "18")
        binding?.student = stu
        binding?.tvName?.setTextColor(Color.RED)
    }

}
