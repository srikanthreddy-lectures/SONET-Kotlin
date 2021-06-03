package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var name = findViewById<EditText>(R.id.et_6_1)
        var gender = findViewById<EditText>(R.id.et_6_2)
        var age = findViewById<EditText>(R.id.et_6_3)
        var btn = findViewById<Button>(R.id.btn_6)

        btn.setOnClickListener(View.OnClickListener {
            val person = Person()
            person.name = name.text.toString()
            person.gender = gender.text.toString()
            person.age = age.text.toString().toInt()

            var result = if(person.age!=0)"${person.name}" else "Person is minor"

            Toast.makeText(this, result, Toast.LENGTH_LONG).show()


        });
    }
}