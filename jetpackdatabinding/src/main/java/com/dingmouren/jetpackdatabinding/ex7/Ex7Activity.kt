package com.dingmouren.jetpackdatabinding.ex7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx7Binding
import com.dingmouren.jetpackdatabinding.databinding.LayoutViewStubBinding

/***
 * 有问题
 */
class Ex7Activity : AppCompatActivity() {

    var ex7 = Ex7Model()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEx7Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex7)

        ex7.name = "小红"


        //按需加载
        if (!binding.viewStub.isInflated){
            binding.viewStub.viewStub?.inflate()
        }

        binding.viewStub.viewStub?.setOnInflateListener { viewStub, inflated ->{
            val viewStubBinding = DataBindingUtil.bind<LayoutViewStubBinding>(inflated)
            viewStubBinding?.ex7 = ex7
        }  }
    }

    fun onClick(view:View){
        ex7.name = "小明"
    }
}
