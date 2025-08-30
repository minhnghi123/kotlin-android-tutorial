package com.example.helloandroid

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    lateinit var txtResult:TextView ;
    lateinit var editNumber1:EditText ;
    lateinit var editNumber2:EditText ;
    lateinit var btnCalculate:Button ;
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo);
        editNumber1 = findViewById(R.id.editNumber1) ;
        editNumber2 = findViewById(R.id.editNumber2) ;
        btnCalculate = findViewById(R.id.btnCalculate) ;
        txtResult = findViewById(R.id.txtResult) ;
        btnCalculate.setOnClickListener(
            {
                try {
                    val number1:Int =  editNumber1.editableText.toString().toInt() ;
                    val number2:Int = editNumber2.editableText.toString().toInt() ;
                    val result:Int = number1 + number2 ;
                    txtResult.text = "Result: " + result.toString() ;
                    val intent = Intent(this,MainActivity2
                    ::class.java) ;
                    intent.putExtra("result",result) ;
                    startActivity(intent) ;
                }
                catch (
                    ex:Exception
                )
                {
                    Log.e("MainActivity", ex.message.toString() ) ;
                    txtResult.text = "Error: " + ex.message.toString() ;
                }


            }
        )

    }
}