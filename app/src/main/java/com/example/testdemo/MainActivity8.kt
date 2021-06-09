package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity8 : AppCompatActivity() {

    var gameState = arrayOf(0,0,0,0,0,0,0,0,0)
    var activePlayer = 1
    var gameActive =true

    var winningPos = arrayOf(arrayOf(0,1,2),arrayOf(3,4,5),arrayOf(6,7,8),arrayOf(0,3,6),arrayOf(1,4,7),arrayOf(2,5,8),arrayOf(0,4,8),arrayOf(2,4,6))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
    }

    fun coinAppear(view:View){
        val img: ImageView = view as ImageView
        var tag:Int = img.getTag().toString().toInt()
        Log.i("Tag"," is :$tag")
        if(gameState[tag] == 0 && gameActive==true){
            gameState[tag] = activePlayer
            if(activePlayer == 1){
                img.setImageResource(R.drawable.white)
                activePlayer = 2
            }
            else{
                img.setImageResource(R.drawable.black)
                activePlayer=1
            }
        }
        for (pos in winningPos){
            if(gameState[pos[0]]!=0 && gameState[pos[0]] == gameState[pos[1]] && gameState[pos[1]] == gameState[pos[2]]){
                gameActive = false
                if(activePlayer==1){
                    Toast.makeText(this,"Black is the winner",Toast.LENGTH_LONG).show()
                }
                else{
                    Toast.makeText(this,"White is the winner",Toast.LENGTH_LONG).show()
                }
            }
        }

    }
}