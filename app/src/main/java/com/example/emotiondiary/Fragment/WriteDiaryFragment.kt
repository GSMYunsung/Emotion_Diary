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

        view.findViewById<ImageView>(R.id.emotion_image).backgroundTintList =
            ColorStateList.valueOf(
                ContextCompat.getColor(requireContext(), safeArgs.color.toInt()))

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
}