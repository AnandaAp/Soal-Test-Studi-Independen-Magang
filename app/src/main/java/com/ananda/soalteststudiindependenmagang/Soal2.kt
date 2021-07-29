package com.ananda.soalteststudiindependenmagang

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ananda.soalteststudiindependenmagang.databinding.FragmentSoal2Binding

class Soal2 : Fragment() {
    private var binding : FragmentSoal2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = FragmentSoal2Binding.inflate(inflater, container, false)
        binding = view
        
        return binding?.root
    }
}