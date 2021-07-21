package com.example.emotiondiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.emotiondiary.viewmodel.Viewmodel

class WriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)

        val countViewModel = ViewModelProvider(this)
            .get(Viewmodel::class.java)
    }
}