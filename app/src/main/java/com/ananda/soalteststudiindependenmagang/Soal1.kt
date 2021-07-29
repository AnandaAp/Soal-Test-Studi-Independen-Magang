package com.ananda.soalteststudiindependenmagang

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ananda.soalteststudiindependenmagang.databinding.FragmentSoal1Binding

class Soal1 : Fragment() {
    private var binding : FragmentSoal1Binding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = FragmentSoal1Binding.inflate(inflater, container,false)
        binding = view
        inputProcess()
        return binding?.root
    }

    private fun inputProcess() {
        binding?.confirmBtnS1?.setOnClickListener{
            val input = binding?.inputS1?.text.toString().toInt()
            process(input)
        }
    }

    private fun process(input: Int) {
        if((input % 3 == 0) && (input % 5 != 0)){
            binding?.outputText?.setText("Hello")
        }
        else if((input % 3 != 0) && (input % 5 == 0)){
            binding?.outputText?.setText("World")
        }
        else if((input % 3 == 0) && (input % 5 == 0)){
            binding?.outputText?.setText("Hello World")
        }
        else if(input % 3 == 1){
            binding?.outputText?.setText("")
        }
        else if (input % 5 == 1){
            binding?.outputText?.setText("")
        }
    }

    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
    }
}