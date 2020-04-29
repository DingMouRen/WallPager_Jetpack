package com.dingmouren.jetpackdatabinding.ex9

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class Ex9Model{
    var name:ObservableField<String> = ObservableField()
    var age:ObservableField<Int> = ObservableField()
}