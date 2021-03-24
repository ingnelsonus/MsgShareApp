package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.holamundo.databinding.ActivityJuegoDescImagenBinding
import com.example.holamundo.databinding.ActivityLayoutsConstrainlayoutBinding

class Juego_Desc_ImagenActivity:AppCompatActivity() {

    companion object {
        val TAG:String = Juego_Desc_ImagenActivity::class.java.simpleName.toString()
    }

    private lateinit var binding: ActivityJuegoDescImagenBinding
    private var correctAnswer="Perro"
    private var intentos=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJuegoDescImagenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener { checAnswer() }
        binding.btnReset.setOnClickListener { resetControls() }
    }


    private fun checAnswer(){

        var answer =binding.txtAnswer.text
        if(answer.toString() != correctAnswer)
        {
            intentos -=1
            binding.lblResult.text="Respuesta incorrecta te quedan "+intentos
        }
        else
            binding.lblResult.text="Respuesta Correcta"
    }

    private fun resetControls()
    {
        binding.txtAnswer.text.clear()
        binding.lblResult.text=""
    }



}