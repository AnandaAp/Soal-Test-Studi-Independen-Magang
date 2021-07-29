package com.ananda.soal1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ananda.soal1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        inputProcess()
        setContentView(binding.root)
    }

    private fun inputProcess() {
        binding.confirmBtn.setOnClickListener {
            if(binding.input.text.toString() != ""){
                val input = binding.input.text.toString().toInt()
                process(input)
            }
            else{
                binding.outputText.text = "Masukan Input Terlebih Dahulu"
            }
        }
    }

    private fun process(input: Int) {
        if((input % 3 == 0) && (input % 5 != 0)){
            binding.outputText.text = "Hello"
        }
        else if((input % 3 != 0) && (input % 5 == 0)){
            binding.outputText.text = "World"
        }
        else if((input % 3 == 0) && (input % 5 == 0)){
            binding.outputText.text = "Hello World"
        }
        else if(input % 3 == 1){
            binding.outputText.text = ""
        }
        else if (input % 5 == 1){
            binding.outputText.text = ""
        }
    }
}