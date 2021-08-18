package com.example.emotiondiary.Fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.emotiondiary.R
import com.example.emotiondiary.databinding.ActivityMainBinding
import com.example.emotiondiary.databinding.FragmentWriteBinding
import com.example.emotiondiary.viewmodel.Viewmodel

class WriteFragment : Fragment() {

    lateinit var navController : NavController
    private val binding2 by lazy { FragmentWriteBinding.inflate(layoutInflater) }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val view: View = inflater!!.inflate(R.layout.fragment_write, container, false)

        view.findViewById<Button>(R.id.next_btn).setOnClickListener {

            view.findNavController().navigate( WriteFragmentDirections
                .actionEmotionFragmentToDiaryFragment(color = colorCase(),emotion = emotionCase()))
        }

        view.findViewById<Button>(R.id.finish_btn).setOnClickListener {
            getActivity()?.finish()
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController(view)

    }

    private fun emotionCase(): String {
        when((view?.findViewById<ImageView>(R.id.emotion_image1)?.drawable as BitmapDrawable).bitmap){
            (ContextCompat.getDrawable(requireContext(),R.drawable.whistle) as BitmapDrawable).bitmap -> return "whistle"
            (ContextCompat.getDrawable(requireContext(),R.drawable.sad) as BitmapDrawable).bitmap -> return "sad"
            (ContextCompat.getDrawable(requireContext(),R.drawable.`fun`) as BitmapDrawable).bitmap -> return "fun"
            (ContextCompat.getDrawable(requireContext(),R.drawable.dizzy) as BitmapDrawable).bitmap -> return "dizzy"
            (ContextCompat.getDrawable(requireContext(),R.drawable.looksly) as BitmapDrawable).bitmap -> return "looksly"
            (ContextCompat.getDrawable(requireContext(),R.drawable.angry) as BitmapDrawable).bitmap -> return "angry"
            (ContextCompat.getDrawable(requireContext(),R.drawable.sleep) as BitmapDrawable).bitmap -> return "sleep"
            (ContextCompat.getDrawable(requireContext(),R.drawable.cute) as BitmapDrawable).bitmap -> return "cute"
        }
        return "none"
    }

    fun colorCase() : String{
       when((view?.findViewById<ImageView>(R.id.emotion_image1)?.background as ColorDrawable).color)
       {
           ContextCompat.getColor(requireContext(),R.color.white) -> return "white"
           ContextCompat.getColor(requireContext(),R.color.teal_200) -> return "teal"
           ContextCompat.getColor(requireContext(),R.color.light_green) -> return "light_green"
           ContextCompat.getColor(requireContext(),R.color.dark_gray) -> return "dark_gray"
           ContextCompat.getColor(requireContext(),R.color.pink) -> return "pink"
           ContextCompat.getColor(requireContext(),R.color.orange) -> return "orange"
           ContextCompat.getColor(requireContext(),R.color.ivory) -> return "ivory"
           ContextCompat.getColor(requireContext(),R.color.lemon) -> return "lemon"
           ContextCompat.getColor(requireContext(),R.color.grapefruit) -> return "grapefruit"
           ContextCompat.getColor(requireContext(),R.color.green) -> return "green"
           ContextCompat.getColor(requireContext(),R.color.purple_200) -> return "purple"
           ContextCompat.getColor(requireContext(),R.color.gray) -> return "gray"
       }
        return "none"
    }
}