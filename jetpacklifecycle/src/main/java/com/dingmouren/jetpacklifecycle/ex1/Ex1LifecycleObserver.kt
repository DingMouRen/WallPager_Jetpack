package com.dingmouren.jetpacklifecycle.ex1

import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import java.lang.StringBuilder

class Ex1LifecycleObserver(var stringBuilder: StringBuilder,val textView: TextView) : LifecycleObserver{
    private val tag = this.javaClass.simpleName

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        stringBuilder.append("lifecycle--onCreate\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        stringBuilder.append("lifecycle--onStart\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        stringBuilder.append("lifecycle--onResume\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        stringBuilder.append("lifecycle--onPause\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        stringBuilder.append("lifecycle--onStop\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        stringBuilder.append("lifecycle--onDestroy\n")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun onAny(){
        stringBuilder.append("lifecycle--onAny\n")
        textView.text = stringBuilder.toString()
        Log.e(tag,stringBuilder.toString())
    }

}