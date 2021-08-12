package com.example.emotiondiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.emotiondiary.Fragment.WriteDiaryFragment
import com.example.emotiondiary.Fragment.WriteFragment
import com.example.emotiondiary.Fragment.WriteFragmentDirections
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.databinding.ActivityWriteBinding
import com.example.emotiondiary.databinding.FragmentWriteBinding
import com.example.emotiondiary.databinding.FragmentWriteDiaryBinding

class WriteActivity : AppCompatActivity() {

    lateinit var navController : NavController
    private val binding by lazy { ActivityWriteBinding.inflate(layoutInflater) }
    private val bindingwrite by lazy { FragmentWriteBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
    }

    fun changeBackground(v : View){
        when(v.id){
            R.id.choose_angry_emotion_image ->{
                bindingwrite.chooseAngryEmotionImage.setImageResource(R.drawable.angry)
            }
        }
    }
    }