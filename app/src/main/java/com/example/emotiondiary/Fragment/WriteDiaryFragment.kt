package com.example.emotiondiary.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.emotiondiary.R

class WriteDiaryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_write_diary, container, false)


        view.findViewById<Button>(R.id.next_btn2).setOnClickListener {
            getActivity()?.finish()
        }

        return view
    }
}