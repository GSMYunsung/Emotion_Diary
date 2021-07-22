package com.example.emotiondiary.viewmodel

import android.app.Application
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.emotiondiary.R
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.room.Entitys
import com.example.emotiondiary.room.RoomAppDB

class Viewmodel(application: Application) : AndroidViewModel(application) {

    private var allEmotion : MutableLiveData<List<Entitys>>

    //Room에 값이 들어가 있는지 아닌지 판단
    private val _isValue = MutableLiveData<Boolean>()

    val isValue : LiveData<Boolean>
        get() = _isValue

    //가시성 판단
    private val _visBoolean = MutableLiveData<Boolean>()
    val visBoolean: MutableLiveData<Boolean>
        get() = _visBoolean

    init {
        allEmotion = MutableLiveData()
    }

    fun isValue(data : Entitys){
        if(data.emotionDiary.isEmpty()){
        }
    }

    private fun getTodayEmotion(){
        val todayDao = RoomAppDB.getAppDatabase(getApplication())?.userDao()
        val todayinEmotion = todayDao?.getTodayEmotionInfo()
        val allinEmotion = todayDao?.getAllEmotionInfo()

        allEmotion.postValue(allinEmotion)
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