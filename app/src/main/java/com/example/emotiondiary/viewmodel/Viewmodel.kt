package com.example.emotiondiary.viewmodel

import android.app.Application
import android.content.ContentProvider
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.emotiondiary.R
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.databinding.ActivityMainBindingImpl
import com.example.emotiondiary.room.Entitys
import com.example.emotiondiary.room.RoomAppDB

class Viewmodel(application: Application) : AndroidViewModel(application) {

    private var allEmotion : MutableLiveData<List<Entitys>>

    //UI 가시성
    private val _visBoolean = MutableLiveData<Boolean>()
    val visBoolean: MutableLiveData<Boolean>
        get() = _visBoolean

    //Room에 값이 들어가 있는지 아닌지 판단
    private val _isValue = MutableLiveData<Boolean>()
    val isValue : MutableLiveData<Boolean>
        get() = _isValue

    private val _isTodayMonthE = MutableLiveData<String>()
    val isTodayMonthE : MutableLiveData<String>
        get() = _isTodayMonthE

    private val _isTodayMonthD = MutableLiveData<String>()
    val isTodayMonthD : MutableLiveData<String>
        get() = _isTodayMonthD

    init {
        allEmotion = MutableLiveData()
        _visBoolean.value = true
        _isValue.value = true
        _isTodayMonthE.value = "Today emotion"
        _isTodayMonthD.value = "Today diary"
    }

    fun isValue(data : Entitys){
        if(data.emotionDiary.isEmpty()){
        }
    }

    fun todayBtnClick() {
            _visBoolean.value = true
            _isTodayMonthE.value = "Today emotion"
            _isTodayMonthD.value = "Today diary"
    }
    fun monthBtnClick(){
            _visBoolean.value = false
            _isTodayMonthD.value = "Month emotion"
            _isTodayMonthE.value = "Month diary"
    }

    fun monthBtnCliasdfck(){
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