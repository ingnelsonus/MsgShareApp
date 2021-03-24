package com.example.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.holamundo.databinding.ActivityLayoutsConstrainlayoutBinding

class Layouts_ConstrainlayoutActivity:AppCompatActivity() {
    companion object{
        val TAG:String = Layouts_ConstrainlayoutActivity::class.java.simpleName.toString()
    }

    private lateinit var binding: ActivityLayoutsConstrainlayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLayoutsConstrainlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviarDatos.setOnClickListener { mostrarDatos() }
        binding.btnLimpiar.setOnClickListener { limpiarDatos() }
    }

    private fun mostrarDatos(){
        val campoNombre = binding.txtNombre.text.toString()
        val campoApellido = binding.txtApellido.text.toString()
        val campoCelular = binding.txtcelular.text.toString()

        if(campoNombre.isEmpty() || campoApellido.isEmpty() || campoCelular.isEmpty())
            Toast.makeText(this,"Por favor ingrese todos los campos",Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,campoNombre+" "+ campoApellido+" tiene el número de celular "+campoCelular,Toast.LENGTH_LONG).show()
    }

    private fun limpiarDatos(){
        binding.txtNombre.text.clear()
        binding.txtApellido.text.clear()
        binding.txtcelular.text.clear()
    }
}