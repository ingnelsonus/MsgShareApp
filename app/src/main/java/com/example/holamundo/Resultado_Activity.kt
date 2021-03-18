package com.example.holamundo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.holamundo.databinding.ActivityResultadoBinding

class Resultado_Activity :AppCompatActivity(){

    companion object{
        val TAG:String = Resultado_Activity::class.java.simpleName.toString()
    }

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_layouts_linearlayout)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val palabraIngresada = intent.extras!!["palabra_ingresada"] as String
        binding.txtResultado.text = palabraIngresada
        Log.e("MainActivity","onCreate")

    }

    override fun onStart(){
        super.onStart()
        Log.e("MainActivity","onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e("MainActivity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("MainActivity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("MainActivity","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("MainActivity","onDestroy")
    }

}