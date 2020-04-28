package com.dingmouren.jetpackdatabinding.ex2

import androidx.databinding.*

data class Ex2Model(
    var name:String, //不可观察的字段
    val age:ObservableInt //可观察字段
)