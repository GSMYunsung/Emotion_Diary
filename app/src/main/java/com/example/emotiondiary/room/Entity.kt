package com.example.emotiondiary.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emotion")
data class Entitys(
    @ColumnInfo(name = "title") val title : String,
    @ColumnInfo(name = "contents") val contents : String,
    @ColumnInfo(name = "emotionDiary") val emotionDiary : String,
    @ColumnInfo(name = "color") val color : String
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id : Int = 0

}