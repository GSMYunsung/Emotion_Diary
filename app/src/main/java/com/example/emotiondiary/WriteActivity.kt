package com.example.emotiondiary

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProvider
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
import com.example.emotiondiary.viewmodel.Viewmodel

class WriteActivity : AppCompatActivity() {

    lateinit var navController : NavController
    private val binding by lazy { ActivityWriteBinding.inflate(layoutInflater) }

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

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.angry)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_angry)
            }
            R.id.choose_cute_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.cute)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_cute)
            }
            R.id.choose_sad_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.sad)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sad)
            }
            R.id.choose_dizzy_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.dizzy)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_dizzy)
            }
            R.id.choose_fun_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.`fun`)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_happy)
            }
            R.id.choose_looksly_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.looksly)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_looksly)
            }
            R.id.choose_whistle_emotion_image ->{

                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.whistle)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_whistle)
            }
            R.id.choose_sleep_emotion_image ->{
                findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.sleep)
                findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sleep)
            }
        }
    }

    fun changeColor(v : View){

        when(v.id){
            R.id.purple -> {
                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
            }
            R.id.gray ->{
                findViewById<ImageView>(R.id.emotion_image1).
                setBackgroundColor(ContextCompat.getColor(this, R.color.gray))
            }
            R.id.lemon ->{
                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.lemon))
            }
            R.id.ivory ->{
                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.ivory))
            }
            R.id.green ->{
                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.green))
            }
            R.id.lightgreen ->{
                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.light_green))
            }
            R.id.mint ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.teal_200))
            }
            R.id.grapefruit ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.grapefruit))
            }
            R.id.orange ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.orange))
            }
            R.id.white ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            }
            R.id.pink ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.pink))
            }
            R.id.darkgray ->{

                findViewById<ImageView>(R.id.emotion_image1)
                    .setBackgroundColor(ContextCompat.getColor(this, R.color.dark_gray))
            }
        }
    }
    }