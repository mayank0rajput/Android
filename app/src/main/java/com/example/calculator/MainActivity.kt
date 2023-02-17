package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(this.layoutInflater)
        setContentView(binding.root)



        binding.buttonadd.setOnClickListener{
            val num1text = binding.num1.text.toString()
            val x = num1text.toDouble()
            val num2text = binding.num2.text.toString()
            val y = num2text.toDouble()
            val z:Double = x + y
            binding.textView1.text = z.toString()
        }
        binding.buttonsub.setOnClickListener{
            val num1text = binding.num1.text.toString()
            val x = num1text.toDouble()
            val num2text = binding.num2.text.toString()
            val y = num2text.toDouble()
            val z2 = x - y
            binding.textView1.text = z2.toString()
        }
        binding.buttonprod.setOnClickListener{
            val num1text = binding.num1.text.toString()
            val x = num1text.toDouble()
            val num2text = binding.num2.text.toString()
            val y = num2text.toDouble()
            val z3 = x * y
            binding.textView1.text = z3.toString()
        }
        binding.buttonqout.setOnClickListener{
            val num1text = binding.num1.text.toString()
            val x = num1text.toDouble()
            val num2text = binding.num2.text.toString()
            val y = num2text.toDouble()
            val z4 = x / y
            binding.textView1.text = z4.toString()
        }

    }
}