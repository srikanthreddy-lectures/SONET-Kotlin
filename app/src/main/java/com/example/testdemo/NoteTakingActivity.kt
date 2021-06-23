package com.example.testdemo

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.testdemo.databinding.ActivityNoteTakingBinding

class NoteTakingActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityNoteTakingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNoteTakingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        var dm=DataManager()

        var list = findViewById<ListView>(R.id.note_listview)
        list.adapter = ArrayAdapter<NoteInfo>(this,android.R.layout.simple_list_item_1,dm.notes)

        list.setOnItemClickListener { parent,view,position,id ->
            val intent = Intent(this,NoteTakingScreen3Activity()::class.java)
            intent.putExtra("item_position",position)
            startActivity(intent)
        }


        binding.fab.setOnClickListener { view ->
            val intent = Intent(this,NoteTakingScreen2Activity()::class.java)
            startActivity(intent)
        }
    }
}