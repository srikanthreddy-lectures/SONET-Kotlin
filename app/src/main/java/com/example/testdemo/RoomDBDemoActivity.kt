package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class RoomDBDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_dbdemo)

        val config = Room.databaseBuilder(this, MyDatabase::class.java, "kmit.db")
        val db=config.build()

        lifecycleScope.launch {
            var dao = db.userDao()

            var user = User(0,"scott","reddy",24)
            dao.addUser(user)

        }

    }
}