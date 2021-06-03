package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btn=findViewById<Button>(R.id.btn_4)
        var fnum=findViewById<EditText>(R.id.et1_4)
        var snum=findViewById<EditText>(R.id.et2_4)
        var res=findViewById<TextView>(R.id.tv_4)
        var sp=findViewById<Spinner>(R.id.spinner_4)
        btn.setOnClickListener(View.OnClickListener {
            var a:Float=fnum.text.toString().toFloat()
            var b:Float=snum.text.toString().toFloat()
            var s=sp.selectedItem.toString()
            when(s){
                "+"-> res.setText("result: "+ add(a,b))
                "-"-> res.setText("result: "+ sub(a,b))
                "*"-> res.setText("result: "+ mul(a,b))
                "/"-> res.setText("result: "+ div(a,b))
                "%"-> res.setText("result: "+ mod(a,b))
            }
        })
    }
    fun add(a:Float,b:Float):Float = a+b
    fun sub(a:Float,b:Float):Float = a-b
    fun mul(a:Float,b:Float):Float= a*b
    fun div(a:Float,b:Float):Float = a/b
    fun mod(a:Float,b:Float):Float = a%b
}
