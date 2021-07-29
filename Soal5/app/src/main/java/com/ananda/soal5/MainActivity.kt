package com.ananda.soal5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ananda.soal5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        palindromeprocess()
        setContentView(binding.root)
    }

    private fun palindromeprocess() {
        binding.confirmBtn.setOnClickListener {
            val case = binding.input.text.toString()
            if(!case.isEmpty() && case != " "){
                val reversed = case.reversed()
                if(reversed == case) {
                    binding.output.text = "TRUE"
                }
                else{
                    binding.output.text = "FALSE"
                }
            }
            else{
                binding.output.text = "Masukan Input terlebih dahulu"
            }
        }
    }
}