package com.example.kotlinprueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener{
            var nombre: String = txt_nom.text.toString()
            var apellido: String = txt_apell.text.toString()
            var aux: String = nombre + " " +  apellido + " ha usado: "
            var j: String = Java.text.toString()
            var c: String = C.text.toString()
            var p: String = Python.text.toString()
            var k: String = Kotlin.text.toString()
            var contador: Int = 0

            var resultado  = ""
            if(nombre.isEmpty() && apellido.isEmpty() || nombre.isEmpty() || apellido.isEmpty()){
                Toast.makeText(this, "Escribe algo", Toast.LENGTH_SHORT).show()
            }else{

                if(Java.isChecked){
                    resultado = resultado + j + ", "
                    contador++
                }
               if(C.isChecked){
                    resultado = resultado + c + ", "
                   contador ++
                }
                if(Python.isChecked){
                    resultado = resultado + p + ", "
                    contador++
                }
                if(Kotlin.isChecked){
                    resultado = resultado + k + ", "
                    contador++
                }

                if(contador == 0){
                    res.text = aux + " nada, deberias de estudiar mas"
                }else {

                    res.text = aux + resultado
                }
            }
            }


    }



     }
