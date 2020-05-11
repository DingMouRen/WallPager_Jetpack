package com.dingmouren.jetpackworkmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.*
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener {
            val constranints = Constraints.Builder()
//                .setRequiresDeviceIdle(true)
//                .setRequiredNetworkType(NetworkType.CONNECTED) //设置特定网络状态
//                .setRequiresBatteryNotLow(true) //设置电池电量在可接受的水平
//                .setRequiresCharging(true) //设置是否在充电时进行
//                .setRequiresStorageNotLow(true) //设置存储是否满足
                .build()

            val work1Request = OneTimeWorkRequestBuilder<Woker1>().setConstraints(constranints).build()

            WorkManager.getInstance(this).enqueue(work1Request)
        }

        btn_2.setOnClickListener {
            val constranints = Constraints.Builder()
//                .setRequiresDeviceIdle(true)
//                .setRequiredNetworkType(NetworkType.CONNECTED) //设置特定网络状态
//                .setRequiresBatteryNotLow(true) //设置电池电量在可接受的水平
//                .setRequiresCharging(true) //设置是否在充电时进行
//                .setRequiresStorageNotLow(true) //设置存储是否满足
                .build()

            val work2Request = PeriodicWorkRequest.Builder(Woker2::class.java,5,TimeUnit.SECONDS).setConstraints(constranints).build()

            WorkManager.getInstance(this).enqueue(work2Request)
        }
    }
}
