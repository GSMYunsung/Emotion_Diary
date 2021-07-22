package com.example.emotiondiary.viewmodel

import android.app.Application
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.emotiondiary.R
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.databinding.ActivityMainBindingImpl
import com.example.emotiondiary.room.Entitys
import com.example.emotiondiary.room.RoomAppDB

class Viewmodel(application: Application) : AndroidViewModel(application) {

    private var allEmotion : MutableLiveData<List<Entitys>>
    private lateinit var binding: ActivityMainBinding

    //UI 가시성
    private val _visBoolean = MutableLiveData<Boolean>()
    val visBoolean: MutableLiveData<Boolean>
        get() = _visBoolean

    //Room에 값이 들어가 있는지 아닌지 판단
    private val _isValue = MutableLiveData<Boolean>()
    val isValue : MutableLiveData<Boolean>
        get() = _isValue

    init {
        allEmotion = MutableLiveData()
        _isValue.value = true
    }

    fun isValue(data : Entitys){
        if(data.emotionDiary.isEmpty()){
        }
    }
    fun todayBtnClick() {
            _visBoolean.value = true
//        startActivity(Intent(this,WriteActivity::class.java))
    }
    fun monthBtnClick(){
            _visBoolean.value = false
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