package com.example.emotiondiary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.viewmodel.Viewmodel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewmodel = ViewModelProvider(this).get(Viewmodel::class.java)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.apply {
            lifecycleOwner = this@MainActivity
            binding.mainActivity = this@MainActivity
        }


        viewmodel.visBoolean.observe(this, Observer { it ->
            viewmodel.isValue.observe(this, Observer {init ->
//                if(init == true){
//                    if(it==true) {
//                        goneRecyclerView(binding.emotionRecyclerview)
//                        goneRecyclerView(binding.monthDiaryRecyclerview)
//                        isTextView(binding.enrollmentText)
//                        isTextView(binding.enrollmentText2)
//                    }
//
//                    else if(it==false){
//                        igoneTextView(binding.enrollmentText)
//                        igoneTextView(binding.enrollmentText2)
//                        isRecyclerView(binding.monthDiaryRecyclerview)
//                        isRecyclerView(binding.emotionRecyclerview)
//                    }
//                }
//
//                else if(init == false){
//                    if(it==true) {
//                        goneRecyclerView(binding.monthDiaryRecyclerview)
//                        goneRecyclerView(binding.emotionRecyclerview)
//
//                        isImageView(binding.emotionImage)
//                        isTextView(binding.emotionText)
//
//                    }
//
//                    else if(it==false){
//                        igoneTextView(binding.enrollmentText)
//                        igoneTextView(binding.enrollmentText2)
//                        isRecyclerView(binding.monthDiaryRecyclerview)
//                        isRecyclerView(binding.emotionRecyclerview)
//                    }
//                }
            })
        })

    }


    fun todayBtnClick() {
        val viewmodel = ViewModelProvider(this).get(Viewmodel::class.java)
        viewmodel.visBoolean.value = true
//        startActivity(Intent(this,WriteActivity::class.java))
    }
    fun monthBtnClick(){
        val viewmodel = ViewModelProvider(this).get(Viewmodel::class.java)
        viewmodel.visBoolean.value = false
    }
}