package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import kotlinx.coroutines.launch

class RoomDBDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_dbdemo)

        var rcv = findViewById<RecyclerView>(R.id.room_rcv)
        rcv.layoutManager = LinearLayoutManager(this)

        var adp = MyAdapter()


        val config = Room.databaseBuilder(this, MyDatabase::class.java, "kmit.db")
        val db=config.build()

        lifecycleScope.launch {

            var dao = db.userDao()

            var user = User(0,"Ram","Reddy",35)
            dao.addUser(user)

            var userList = dao.readAllData()

            //Log.i("---->","${userList.get(0).firstName.toString()}")
            adp.setData(userList)
        }

        rcv.adapter = adp

    }
}