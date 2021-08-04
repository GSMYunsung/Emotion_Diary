package com.example.emotiondiary

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.emotiondiary.Fragment.WriteDiaryFragment
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.viewmodel.Viewmodel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewmodel = ViewModelProvider(this).get(Viewmodel::class.java)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        //이곳에서 메인엑티비티의 뷰모델과 메인 엑티비티의 라이프사이클을 관리한다.
        binding.apply {
            lifecycleOwner = this@MainActivity
            binding.mainActivity = this@MainActivity
            binding.viewModel = viewmodel
        }

    }

    fun writeDiary(){
        startActivity(Intent(this,WriteActivity::class.java))
    }
}