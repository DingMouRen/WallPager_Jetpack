package com.dingmouren.jetpackviewmodel.ex1

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.dingmouren.jetpackviewmodel.R
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_ex1.*

class Ex1Activity : AppCompatActivity() {

    private lateinit var mEx1ViewModel:Ex1ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        mEx1ViewModel = ViewModelProvider(this)[Ex1ViewModel::class.java]

        tv.text = mEx1ViewModel.number.toString()
        btn.setOnClickListener {
            mEx1ViewModel.number++
            tv.text = mEx1ViewModel.number.toString()

        }

    }


}
