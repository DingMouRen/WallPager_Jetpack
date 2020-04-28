package com.dingmouren.jetpackdatabinding.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.*
import com.dingmouren.jetpackdatabinding.R
import com.dingmouren.jetpackdatabinding.databinding.ActivityEx2Binding
import java.util.logging.Logger

/***
 * 此处的只修改ex2.name，ui不会刷新的，如果先修改ex2.name,再修改ex2.age，ui中的name也会刷新，因为age刷新，ui一定刷新，此时name的值已经变化，这样显示
 * 的就是最新的name了
 */
class Ex2Activity : AppCompatActivity() {

    private val ex2 = Ex2Model(
        "小红",
        ObservableInt(16))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityEx2Binding = DataBindingUtil.setContentView(this,R.layout.activity_ex2)
        binding.ex2 = ex2

    }

    fun onClick(view: View){

        when(view.id){
            R.id.btn_1 -> ex2.name = "小明"
            R.id.btn_2 -> ex2.age.set(ex2.age.get() + 1)
        }
    }
}
