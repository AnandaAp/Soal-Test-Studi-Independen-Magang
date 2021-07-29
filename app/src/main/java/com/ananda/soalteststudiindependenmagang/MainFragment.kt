package com.ananda.soalteststudiindependenmagang

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ananda.soalteststudiindependenmagang.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =FragmentMainBinding.inflate(inflater, container,false)
        binding = view
        navigate()
        return binding?.root
    }

    private fun navigate() {
        toSoal1()
    }

    private fun toSoal1() {
        binding?.soal1Btn?.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_soal1)
        }
    }
}