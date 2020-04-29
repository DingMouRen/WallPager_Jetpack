package com.dingmouren.jetpackdatabinding.ex7

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.dingmouren.jetpackdatabinding.BR

class Ex7Model : BaseObservable() {
    @get:Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}