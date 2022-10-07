package com.example.evaluacioncontinua1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import com.example.evaluacioncontinua1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCalcular.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        verificarDNI()
    }

    private fun verificarDNI() {
        val anioPersona= binding.edtAnio.text.toString().toInt()
        val anioActual=2022
        val calc=anioActual-anioPersona
        var resultado=""

        if(anioPersona>=2023||anioPersona<=1900){
           resultado="Ingrese un Año de nacimiento valido"
        }else{
            if(calc>=18){
                resultado="Debe sacar su DNI."
            }else{
                resultado="Es menor de edad, no puede sacar su DNI"
            }
        }

        binding.tvResultado.text=resultado

    }
}