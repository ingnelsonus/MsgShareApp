package com.example.holamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.holamundo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_main)

        //val button:Button = findViewById<Button>(R.id.btnToast)
        binding.btnToast.setOnClickListener { btnToastClick() }
        binding.btnNext.setOnClickListener { btnNextClick() }
        binding.btnGoToConstrain.setOnClickListener { btnGoToConstrainLayOutClick() }
        binding.btnGoToJuego.setOnClickListener { btnGoToPlayImageGame() }
        binding.btnSendMsjActivity.setOnClickListener { btnGoToResutActivity() }
        binding.btngoLogin.setOnClickListener { btnGoToLoginClick() }
    }

    private fun btnToastClick(){
        val nombreMascota =binding.nombrePerrito.text.toString()
        if(nombreMascota.isEmpty())
            Toast.makeText(this,"Por favor ingrese el nombre de la mascota!...",Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(this,"El nombre de la mascota es: "+nombreMascota,Toast.LENGTH_SHORT).show()
    }

    private fun btnNextClick(){

        val intent = Intent(this,Layouts_LinearlayoutActivity::class.java)
        startActivity(intent)
    }

    private fun btnGoToConstrainLayOutClick(){
        val intent =Intent(this,Layouts_ConstrainlayoutActivity::class.java)
        startActivity(intent)
    }

    private fun btnGoToPlayImageGame()
    {
        val intent =Intent(this,Juego_Desc_ImagenActivity::class.java)
        startActivity(intent)
    }

    private fun btnGoToResutActivity()
    {
        var textoIngresado = binding.nombrePerrito.text.toString()
        var intent = Intent(this,Resultado_Activity::class.java)
        intent.putExtra("palabra_ingresada",textoIngresado)
        startActivity(intent);
    }

    private fun btnGoToLoginClick()
    {
        var intent = Intent(this,InstagramLoginActivity::class.java)
        startActivity(intent);
    }

}