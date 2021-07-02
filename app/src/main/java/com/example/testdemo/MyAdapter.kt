package com.example.testdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter() : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    var userList = emptyList<User>()

    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem = userList[position]

        var id = holder.itemView.findViewById<TextView>(R.id.room_row_id)
        id.text = currentItem.id.toString()

        var firstName = holder.itemView.findViewById<TextView>(R.id.room_row_firstname)
        firstName.text = currentItem.firstName.toString()

        var lastName = holder.itemView.findViewById<TextView>(R.id.room_row_lastname)
        lastName.text = currentItem.lastName.toString()

        var age = holder.itemView.findViewById<TextView>(R.id.room_row_age)
        age.text = "(${currentItem.age.toString()})"

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun setData(user:List<User>){
        userList=user
        notifyDataSetChanged()
    }
}