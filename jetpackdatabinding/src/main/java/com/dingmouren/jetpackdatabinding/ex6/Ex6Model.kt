package com.dingmouren.jetpackdatabinding.ex6

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.dingmouren.jetpackdatabinding.BR

class Ex6Model: BaseObservable(){
    @get:Bindable
    var name:String = ""
        set(value){
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var age:Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }
}