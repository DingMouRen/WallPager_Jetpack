package com.dingmouren.jetpackroom.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dingmouren.jetpackroom.db.dao.ShoeDao
import com.dingmouren.jetpackroom.db.entity.Shoe

/**
 * 数据库文件，使用单例避免过多资源消耗
 */
@Database(
    entities = [
        Shoe::class
       ],
    version = 1
//    exportSchema = false
    )
abstract class AppDatabase:RoomDatabase() {


    abstract fun shoeDao():ShoeDao //得到ShoeDao



}