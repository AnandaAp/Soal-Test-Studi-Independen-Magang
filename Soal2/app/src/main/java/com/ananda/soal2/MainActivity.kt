package com.ananda.soal2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ananda.soal2.databinding.ActivityMainBinding
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        emailCheck()
        setContentView(binding.root)
    }

    private fun emailCheck() {
        binding.confirmBtn.setOnClickListener{
            val email = binding.input.text.toString()
            if(email != null || email != ""){
                val regexID = Regex("""[a-zA-Z0-9\.\_\-]{0,20}""" +
                        """\@""" +
                        """[a-zA-Z0-9][a-zA-Z0-9\-]{0,64}""" +
                        """\.""" +
                        """id""")
                val regexCOID = Regex("""[a-zA-Z0-9\.\_\-]{0,20}""" +
                        """\@""" +
                        """[a-zA-Z0-9][a-zA-Z0-9\-]{0,64}""" +
                        """\.""" +
                        """co.id""")
                if(regexID.matches(email)){
                    println("email : "+email+" = "+regexID.matches(email))
                    binding.outputText.text = "email : "+email+" = "+regexID.matches(email)
                }
                else if(regexCOID.matches(email)){
                    println("email : "+email+" = "+regexCOID.matches(email))
                    binding.outputText.text = "email : "+email+" = "+regexCOID.matches(email)
                }
                else {
                    println("Email Salah")
                    binding.outputText.text = "Email Salah"
                }
            }
            else{
                binding.outputText.text = ""
            }
        }
    }
}