package com.example.testdemo

import android.R.attr.button
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input_result= findViewById<EditText>(R.id.input_radius)
        var btn = findViewById<Button>(R.id.btn)
        var txt = findViewById<TextView>(R.id.txtView);


        btn.setOnClickListener(View.OnClickListener {
            // Code here executes on main thread after user presses button
            val pi:Double = 3.141

            var a:Editable = input_result.text
            var b:String = a.toString()
            var radius:Double = b.toDouble()

            //var rad = input_result.text.toString().toDouble()

            var area = pi * radius * radius

            txt.setText("Result : $area")

        })

        /*
        var btn = findViewById<Button>(R.id.btn)
        var txt = findViewById<TextView>(R.id.txt);
        var input_result= findViewById<EditText>(R.id.input_radius)

        var flag=false;
        btn.setOnClickListener(View.OnClickListener {
            // Code here executes on main thread after user presses button

        })

         */
    }
}