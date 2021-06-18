package com.example.testdemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizActivity : AppCompatActivity(),View.OnClickListener {
    
    private var listOfQuestions: ArrayList<Questions>? = null
    var currentPosition = 1
    lateinit var question:TextView
    lateinit var optionOne:TextView
    lateinit var optionTwo:TextView
    lateinit var optionThree:TextView
    lateinit var optionFour:TextView
    lateinit var submitBtn:Button

     var selectedChoice:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        var utility = Utility()
        listOfQuestions = utility.getQuestion()

        var name:String? = intent.getStringExtra("name")
        var q_name = findViewById<TextView>(R.id.q_name_)
        q_name.text=name

        question = findViewById<TextView>(R.id.q_question)
        optionOne = findViewById<TextView>(R.id.tv_option_one)
        optionTwo = findViewById<TextView>(R.id.tv_option_two)
        optionThree = findViewById<TextView>(R.id.tv_option_three)
        optionFour = findViewById<TextView>(R.id.tv_option_four)
        submitBtn = findViewById<Button>(R.id.q_btn_next)


        setQuestion();

        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)

        submitBtn.setOnClickListener(View.OnClickListener {
            var ans = listOfQuestions!!.get(currentPosition-1).answer

            checkAnswer(ans,selectedChoice);

        })
    }

    private fun checkAnswer(ans:Int,id:Int){
        when(ans){
            1 ->{
                Log.i("---->",id.toString())
                if(ans ==id)
                    optionOne.background=ContextCompat.getDrawable(this,R.drawable.right_option_color)
                else
                    optionOne.background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            }
            2 ->{
                if(ans ==id)
                    optionTwo.background=ContextCompat.getDrawable(this,R.drawable.right_option_color)
                else
                    optionTwo.background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            }
            3 ->{
                if(ans ==id)
                    optionThree.background=ContextCompat.getDrawable(this,R.drawable.right_option_color)
                else
                    optionThree.background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            }
            4 ->{
                if(ans ==id)
                    optionFour.background=ContextCompat.getDrawable(this,R.drawable.right_option_color)
                else
                    optionFour.background=ContextCompat.getDrawable(this,R.drawable.wrong_option_color)
            }
        }
    }

    fun setQuestion(){
        var questionObject = listOfQuestions!!.get(currentPosition-1)
        question.text= questionObject.question
        optionOne.text= questionObject.optOne
        optionTwo.text= questionObject.optTwo
        optionThree.text= questionObject.optThree
        optionFour.text= questionObject.optFour

    }

    override fun onClick(v: View){
        //logic
        when(v.id){
            R.id.tv_option_one ->{
                selectedOption(optionOne,R.drawable.selected_option_border_bg)
            }
            R.id.tv_option_two ->{
                selectedOption(optionTwo,R.drawable.selected_option_border_bg)
            }
            R.id.tv_option_three ->{
                selectedOption(optionThree,R.drawable.selected_option_border_bg)
            }
            R.id.tv_option_four ->{
                selectedOption(optionFour,R.drawable.selected_option_border_bg)
            }
        }
    }

    private fun selectedOption(tv: TextView,id:Int){
        defaultOption();
        tv.background = ContextCompat.getDrawable(this,id)
        selectedChoice = id;
    }

    private fun defaultOption(){
        optionOne.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        optionTwo.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        optionThree.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        optionFour.background = ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
    }
}