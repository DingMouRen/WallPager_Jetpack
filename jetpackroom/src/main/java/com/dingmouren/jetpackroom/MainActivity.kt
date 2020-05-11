package com.dingmouren.jetpackroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.dingmouren.jetpackroom.db.AppDatabase
import com.dingmouren.jetpackroom.db.entity.Shoe
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val stringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(applicationContext,AppDatabase::class.java,"demo.db").allowMainThreadQueries().build()

        btn_1.setOnClickListener {
            for(index in 1..10){
                var shoe = Shoe("name_".plus(index),
                "description_".plus(index),
                index.toFloat(),
                "brand".plus(index),
                "imageUrl_".plus(index))
                db.shoeDao().insertShoe(shoe)
            }
        }

        btn_2.setOnClickListener {
            var shoes = db.shoeDao().findShoesAll()
            for (item in shoes!!){
                stringBuilder.append(item.name+"\n")
            }

            tv.text = stringBuilder.toString()
        }
    }
}
