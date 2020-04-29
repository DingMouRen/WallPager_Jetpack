package com.dingmouren.jetpackdatabinding.ex8

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.dingmouren.jetpackdatabinding.BR

class Ex8Model : BaseObservable(){
    @get:Bindable
    var name:String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    override fun toString(): String {
        return "[Ex8Model name:$name]"
    }
}