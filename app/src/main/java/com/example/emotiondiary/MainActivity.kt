package com.example.emotiondiary

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.viewmodel.Viewmodel
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding =  DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainActivity = this

    }

    fun btnSetOnclick(){
        startActivity(Intent(this,WriteActivity::class.java))
    }
}