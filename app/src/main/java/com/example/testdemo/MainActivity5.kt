package com.example.testdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*;


fun ChangeWater(temp : Int , dirtt : Int , day : String ):Boolean = temp > 30 || dirtt > 30 || day == "Sunday";
fun RandomDay() : String {
    var arr = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    var d:String = arr[Random().nextInt(arr.size)]
    return d
}
fun Feed(day:String):String{
    var res =""
    when(day){
        "Monday" ->res="flakes"
        "Tuesday" ->res="pellets"
        "Wednesday" ->res="redworms"
        "Thursday"->res="granules"
        "Friday" -> res="mosquitoes"
        "Saturday" -> res="lettuce"
        "Sunday" -> res="plankton"
    }
    return res
}
class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var ip1 = findViewById<EditText>(R.id.entry_1);
        var ip2 = findViewById<EditText>(R.id.entry_2);
        var but11 = findViewById<Button>(R.id.infobut);
        var res1 = findViewById<TextView>(R.id.out_1);
        var res2 = findViewById<TextView>(R.id.out_2);
        but11.setOnClickListener(View.OnClickListener {
            var temperature = ip1.text.toString().toInt()
            var dirt = ip2.text.toString().toInt()
            var day:String = RandomDay()
            var food:String = Feed(day)
            res1.setText("Today is $day, You need to feed $food")
            when(ChangeWater(temperature,dirt,day)){
                true -> res2.setText("Change Water is required")
                false -> res2.setText("Change of water is not required")
            }
        }
        )
    }
}