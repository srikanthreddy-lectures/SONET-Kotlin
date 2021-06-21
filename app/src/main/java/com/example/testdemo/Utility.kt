package com.example.testdemo

import android.util.Log
import java.net.HttpURLConnection
import java.net.URL

class Utility {

    fun getQuestion():ArrayList<Questions>{
        var list = ArrayList<Questions>()
        //logic
        var q1 = Questions(1,"What is kotlin?","Scripting Language","Programming Language","Modern Language","Assembly Language",3)
        var q2 = Questions(2,"What is Java?","Scripting Language","Programming Language","Modern Language","Assembly Language",2)
        var q3 = Questions(3,"What is Browser?","Apple software","Google Tool","Desktop/Moibile Client","Language",3)

        list.add(q1);
        list.add(q2)
        list.add(q3)
        return list;
    }

    fun getQuestionFromGithub():ArrayList<Questions>{
        var list = ArrayList<Questions>()
        //logic
        Thread(Runnable {
            var response:String = URL("https://raw.githubusercontent.com/srikanthreddy-lectures/SONET-Kotlin/main/questions.json").readText()
            Log.i("----> Response : ",response)

        }).start()
        return list;
    }
}