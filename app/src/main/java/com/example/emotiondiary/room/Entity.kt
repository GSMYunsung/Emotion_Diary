package com.example.emotiondiary.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emotion")
data class Entitys(
    //감정일기 타이틀
    @ColumnInfo(name = "title") val title : String,
    //감정일기 내용
    @ColumnInfo(name = "contents") val contents : String,
    //감정일기 날짜
    @ColumnInfo(name = "Date") val emotionDiary : String,
    //감정 색
    @ColumnInfo(name = "color") val color : String,
    //감정
    @ColumnInfo(name = "emotion") val emotion : String,
    //유저가 글을 쓴 날짜
    @ColumnInfo(name = "date") val date : String
    ){
    //유저 아이디
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id : Int = 0

}