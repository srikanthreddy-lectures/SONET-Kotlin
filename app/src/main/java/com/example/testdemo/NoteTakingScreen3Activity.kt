package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NoteTakingScreen3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_taking_screen3)

        var id:Int = intent.getIntExtra("item_position",-1)

        var dm = DataManager()
        var note = dm.notes.get(id)

        var note_title = findViewById<TextView>(R.id.note_3_title)
        note_title.setText(note.title)

        var note_text = findViewById<EditText>(R.id.note_3_text)
        note_text.setText(note.text)

        //Toast.makeText(this,"Position $id",Toast.LENGTH_SHORT).show()
    }
}