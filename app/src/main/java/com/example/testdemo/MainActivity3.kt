package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var input = findViewById<EditText>(R.id.inputNum);
        var btn = findViewById<Button>(R.id.btn_3);
        var result = findViewById<TextView>(R.id.tv_3)

        btn.setOnClickListener(View.OnClickListener {
           // var a:Editable = input.text;
           // var num:Int = a.toString().toInt();

            var num:Int = input.text.toString().toInt();
            var i:Int = 1;
            var s:String = "";
            while (true){
                s += "$i@" // s = s + i
                if(i==num){
                    break;
                }
                ++i
            }
            result.setText(s)
        });
    }
}