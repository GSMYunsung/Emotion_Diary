package com.example.emotiondiary.room

import androidx.room.*

@Dao
interface DAO {
    @Query("SELECT * FROM emotion ORDER BY id DESC")
    fun getAllEmotionInfo() : List<Entitys>

    //오늘의 일기와 감정을 가져오기 위한것
    @Query("SELECT * FROM emotion ORDER BY id DESC limit 1")
    fun getTodayEmotionInfo() : List<Entitys>

    @Insert
    fun insertEmotion(user : Entitys?)

    @Delete
    fun deleteEmotion(user : Entitys)

    @Query("DELETE FROM emotion")
    fun deleteAllEmotion(user : Entitys)

    @Update
    fun updateEmotion(user : Entitys?)
}