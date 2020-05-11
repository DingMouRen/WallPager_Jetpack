package com.dingmouren.jetpackroom.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dingmouren.jetpackroom.db.entity.Shoe

/***
 *
 * @Query:不仅可以声明查询语句，也可以进行删除和修改，但是不能进行新增
 *
 * @Insert可以设置onConflict属性，默认是OnConflictStrategy.ABORT,表示当插入有冲突时的处理策略
 * OnConflictStrategy.REPLACE:取代旧数据同时继续事务
 * OnConflictStrategy.ROLLBACK:回滚事务，弃用
 * OnConflictStrategy.ABORT:终止事务
 * OnConflictStrategy.FAIL:事务失败，弃用
 * OnConflictStrategy.IGNORE:忽略冲突
 *
 */

/**
 * 鞋子的方法
 */
@Dao
interface ShoeDao {

    //添加一双鞋子
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertShoe(shoe:Shoe)

    //添加多双鞋子
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertShoes(shoes:List<Shoe>)


    //删除一双鞋子
    @Delete
    fun deleteShoe(shoe: Shoe)

    //删除多双鞋子
    @Delete
    fun deleteShoes(shoes:List<Shoe>)

    //更新一双鞋子
    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateShoe(shoe: Shoe)

    //更新多双鞋子
    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateShoes(shoes:List<Shoe>)


    // ------ 查询 ------

    //查询一个
    @Query("select * from shoe where id=:id")
    fun findShoeById(id:Long):Shoe?

    //查询所有
    @Query("select * from shoe")
    fun findShoesAll():List<Shoe>

    //查询多个，通过品牌查询多双鞋
    @Query("select * from shoe where shoe_brand=:brand")
    fun findShoesByBrand(brand:String):List<Shoe>

    //模糊查询+排序 通过同名鞋名查询鞋
    @Query("select * from shoe where shoe_name like :name order by shoe_brand asc")
    fun findShoesByName(name:String):List<Shoe>

    //配合livedata 返回所有鞋子
    @Query("select * from shoe")
    fun getAllShoesLD():LiveData<List<Shoe>>

    //配合livedata 通过id查询单款鞋子
    @Query("select * from shoe where id=:id")
    fun findShoeByIdLD(id:Long):LiveData<Shoe>




}