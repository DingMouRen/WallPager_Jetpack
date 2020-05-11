package com.dingmouren.jetpackworkmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class Woker1(context:Context,workerParam:WorkerParameters):Worker(context,workerParam) {
    private val tag = "Worker1"
    override fun doWork(): Result {
        Log.e(tag,"dowork--start "+Thread.currentThread().name)
        Log.e(tag,"dowork--working "+Thread.currentThread().name)
        Log.e(tag,"dowork--end "+Thread.currentThread().name)
        return Result.success()

    }
}