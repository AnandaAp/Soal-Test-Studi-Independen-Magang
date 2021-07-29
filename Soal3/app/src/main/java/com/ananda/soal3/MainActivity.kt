package com.ananda.soal3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ananda.soal3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        timeConversion()
        setContentView(binding.root)
    }

    private fun timeConversion() {
        binding.confirmBtn.setOnClickListener {
            val time = binding.input.text.toString()
            val regexPM = Regex("""([0][0-9]|[1][0-2])""" +
                    """:[0-5][0-9]""" +
                    """:[0-5][0-9]"""+
                    """ PM""")
            val regexAM = Regex("""([0][0-9]|[1][0-2])""" +
                    """:[0-5][0-9]""" +
                    """:[0-5][0-9]"""+
                    """ AM""")
            if(regexAM.matches(time)){
                println("am")
                val regexTime = Regex("""([1][2])"""+
                                """:([0-5][0-9])""" +
                                """:([0-5][0-9])""")
                if(regexTime.containsMatchIn(time)){
                    val temp = Regex(":").split(time).toMutableList()
                    println(temp)
                    temp[0] = "00"
                    val result = temp[0]+":"+temp[1]
                    println(result)
                    binding.output.text = result
                }
                else{
                    val temp = Regex(":").split(time).toMutableList()
                    println(temp)
                    val result = temp[0]+":"+temp[1]
                    println(result)
                    binding.output.text = result
                }
            }
            else if(regexPM.matches(time)){
                println("pm")
                val regexTime = Regex("""(0[0-9]|1[0-1])"""+
                        """:([0-5][0-9])""" +
                        """:([0-5][0-9])""")
                if(regexTime.containsMatchIn(time)){
                    val temp = Regex(":").split(time).toMutableList()
                    val condition = temp[0].toInt()
                    if(condition < 12){
                        temp[0] = (condition+12).toString()
                    }
                    val result = temp[0]+":"+temp[1]
                    println(result)
                    binding.output.text = result
                }
                else{
                    val temp = Regex(":").split(time).toMutableList()
                    val result = temp[0]+":"+temp[1]
                    println(result)
                    binding.output.text = result
                }
            }
        }
    }
}