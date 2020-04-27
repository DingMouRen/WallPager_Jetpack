package com.dingmouren.jetpackdatabinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx1Binding
import com.dingmouren.jetpackdatabinding.model.Student

/***
 * 基础入门
 */
class Ex1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val binding:ActivityEx1Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex1)

        //创建数据model:Student
        val stu = Student("小红","18")
        binding.student = stu
    }
}
