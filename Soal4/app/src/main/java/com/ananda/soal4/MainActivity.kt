package com.ananda.soal4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ananda.soal4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        revereseProcess()
        setContentView(binding.root)
    }

    private fun revereseProcess() {
        binding.confirmBtn.setOnClickListener{
            val case = binding.input.text.toString()
            if(case.isNotBlank() && case != " "){
                val reverse = case.reversed()
                binding.output.text = reverse
                println(reverse)
            }
            else{
                binding.output.text = "Masukan Input Terlebih Dahulu"
            }
        }
    }
}