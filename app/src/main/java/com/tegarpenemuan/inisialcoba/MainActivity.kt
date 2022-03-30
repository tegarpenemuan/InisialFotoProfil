package com.tegarpenemuan.inisialcoba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tegarpenemuan.inisialcoba.databinding.ActivityMainBinding
import com.tegarpenemuan.inisialcoba.utils.InisialCode.getInitial


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUbah.setOnClickListener {
            val data = binding.etInputInisial.text.toString()
            if(data == "") {
                binding.tvInisial.text = "TP"
            } else {
                binding.tvInisial.text = data.getInitial()
            }

        }
    }
}