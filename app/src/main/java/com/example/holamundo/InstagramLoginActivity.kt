package com.example.holamundo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.holamundo.databinding.ActivityInstagramloginBinding

class InstagramLoginActivity : AppCompatActivity() {

    companion object {
        val TAG: String = InstagramLoginActivity::class.java.simpleName.toString()
    }

    private lateinit var binding: ActivityInstagramloginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInstagramloginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}