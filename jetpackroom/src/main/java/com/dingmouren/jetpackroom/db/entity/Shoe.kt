package com.dingmouren.jetpackroom.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * 鞋表
 */
@Entity(tableName = "shoe")
data class Shoe(
    @ColumnInfo(name = "shoe_name") val name:String?,//鞋名
    @ColumnInfo(name = "shoe_description") val description:String?,//描述
    @ColumnInfo(name = "shoe_price") val price:Float?,//价格
    @ColumnInfo(name = "shoe_brand") val brand:String?,//品牌
    @ColumnInfo(name = "shoe_imgUrl") val imgageUrl:String? //图片地址
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id:Long = 0

}