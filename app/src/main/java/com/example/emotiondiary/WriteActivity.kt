package com.example.emotiondiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
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
    private val bindingWrite by lazy { FragmentWriteBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()
    }

    fun changeBackground(v : View){

        when(v.id){
            R.id.choose_angry_emotion_image -> {
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.angry)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_angry)
            }
            R.id.choose_cute_emotion_image ->{
             findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.cute)
             findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_cute)
            }
            R.id.choose_sad_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.sad)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sad)
            }
            R.id.choose_dizzy_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.dizzy)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_dizzy)
            }
            R.id.choose_fun_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.`fun`)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_happy)
            }
            R.id.choose_looksly_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.looksly)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_looksly)
            }
            R.id.choose_whistle_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.whistle)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_whistle)
            }
            R.id.choose_sleep_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.sleep)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sleep)
            }
        }
    }
    }