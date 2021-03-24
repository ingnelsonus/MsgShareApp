package com.example.holamundo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.holamundo.databinding.ActivityLayoutsLinearlayoutBinding


class Layouts_LinearlayoutActivity:AppCompatActivity() {

    companion object{
        val TAG:String = Layouts_LinearlayoutActivity::class.java.simpleName.toString()
    }

    private lateinit var binding:ActivityLayoutsLinearlayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_layouts_linearlayout)
        binding = ActivityLayoutsLinearlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviarDatos.setOnClickListener { mostrarDatos() }
        binding.btnLimpiar.setOnClickListener { limpiarDatos() }

    }

    private fun mostrarDatos(){
        val campoNombre = binding.txtnombre.text.toString()
        val campoApellido = binding.txtapellido.text.toString()
        val campoCelular = binding.txtcelular.text.toString()

        if(campoNombre.isEmpty() || campoApellido.isEmpty() || campoCelular.isEmpty())
            Toast.makeText(this,"Por favor ingrese todos los campos",Toast.LENGTH_LONG).show()
        else
            Toast.makeText(this,campoNombre+" "+ campoApellido+" tiene el número de celular "+campoCelular,Toast.LENGTH_LONG).show()
    }

    private fun limpiarDatos(){
        binding.txtnombre.text.clear()
        binding.txtapellido.text.clear()
        binding.txtcelular.text.clear()
    }

}