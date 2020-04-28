package com.dingmouren.jetpackdatabinding.ex3

import androidx.databinding.ObservableField

data class Ex3Model(
    var name: ObservableField<String>,//可观察字段
    val age:ObservableField<Int> //可观察字段
)