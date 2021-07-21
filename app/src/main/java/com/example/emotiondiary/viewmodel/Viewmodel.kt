package com.example.emotiondiary.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.emotiondiary.room.Entitys
import com.example.emotiondiary.room.RoomAppDB

class Viewmodel(app : Application) : AndroidViewModel(app) {

    private var allEmotion : MutableLiveData<List<Entitys>> = MutableLiveData()
    private var todayEmotion : MutableLiveData<List<Entitys>>

    init {
        todayEmotion = MutableLiveData()
        allEmotion = MutableLiveData()
    }

    private fun getTodayEmotion(){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        val todayinEmotion = todayDao?.getTodayEmotionInfo()
        val allinEmotion = todayDao?.getAllEmotionInfo()

        allEmotion.postValue(allinEmotion)
        todayEmotion.postValue(todayinEmotion)
    }

    fun insertEmotionInfo(entity: Entitys){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        todayDao?.insertEmotion(entity)
        getTodayEmotion()
    }

    fun deleteEmotionInfo(entity: Entitys){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        todayDao?.deleteEmotion(entity)
        getTodayEmotion()
    }

    fun deleteAllEmotionInfo(entity: Entitys){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        todayDao?.deleteAllEmotion(entity)
        getTodayEmotion()
    }

    fun updateEmotionInfo(entity: Entitys){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        todayDao?.deleteEmotion(entity)
        getTodayEmotion()
    }

    interface RowClickListener{
        fun onDeleteUserClickListener(user : Entitys)
        fun onItemClikListener(user: Entitys)
    }
}