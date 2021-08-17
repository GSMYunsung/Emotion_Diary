package com.example.emotiondiary.Fragment

import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.emotiondiary.R

class WriteDiaryFragment : Fragment() {


    val safeArgs: WriteDiaryFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_write_diary, container, false)

        setColor(view)

        view.findViewById<Button>(R.id.next_btn2).setOnClickListener {
            getActivity()?.finish()
        }

        view.findViewById<Button>(R.id.back_btn).setOnClickListener {
            view.findNavController().navigate(R.id.action_diaryFragment_to_emotionFragment)
        }

        view.findViewById<Button>(R.id.finish_btn2).setOnClickListener {
            getActivity()?.finish()
        }

        return view
    }

    private fun setColor(v : View) {
        when (safeArgs.color) {
        "white" -> {
            v.findViewById<ImageView>(R.id.emotion_image)
            .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.white))
        }
        "teal" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.teal_200))
        }
        "light_green" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.light_green))
        }
        "dark_gray" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.dark_gray))
        }
        "pink" -> {
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.pink))
        }
        "orange" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.orange))
        }
        "ivory" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.ivory))
        }
        "lemon" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.lemon))
        }
        "grapefruit" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.grapefruit))
        }
        "green" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.green))
        }
        "purple" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.purple_200))
        }
        "gray" ->{
            v.findViewById<ImageView>(R.id.emotion_image)
                .setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.gray))
        }
    }
    }
    private fun setBackground(v : View){

        when(v.id){
            R.id.choose_angry_emotion_image -> {

                v.findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.angry)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_angry)
            }
            R.id.choose_cute_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.cute)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_cute)
            }
            R.id.choose_sad_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.sad)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sad)
            }
            R.id.choose_dizzy_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.dizzy)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_dizzy)
            }
            R.id.choose_fun_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image).setImageResource(R.drawable.`fun`)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_happy)
            }
            R.id.choose_looksly_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.looksly)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_looksly)
            }
            R.id.choose_whistle_emotion_image ->{

                v.findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.whistle)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_whistle)
            }
            R.id.choose_sleep_emotion_image ->{
                v.findViewById<ImageView>(R.id.emotion_image1).setImageResource(R.drawable.sleep)
                v.findViewById<TextView>(R.id.emotion_text).text = getString(R.string.emotion_sleep)
            }
        }
    }
}