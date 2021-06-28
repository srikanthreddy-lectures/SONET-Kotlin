package com.example.testdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LaunchExternalAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_external_app)

        var btn=findViewById<Button>(R.id.etx_btn)

        btn.setOnClickListener(View.OnClickListener {
            //var uri = Uri.parse("tel:1234567")

           // var uri = Uri.parse("https://www.facebook.com")
           // var _in = Intent(Intent.ACTION_VIEW,uri)
            //_in.setData()
            //var _in = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            var _in = Intent("android.media.action.IMAGE_CAPTURE")
            startActivity(_in)
        })
    }
}