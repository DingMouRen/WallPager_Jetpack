package com.dingmouren.jetpackviewmodel.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import com.dingmouren.jetpackviewmodel.R

class Ex2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)
    }

    override fun getViewModelStore(): ViewModelStore {
        return super.getViewModelStore()
    }
}
