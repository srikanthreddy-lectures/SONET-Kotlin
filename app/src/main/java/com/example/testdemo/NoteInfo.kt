package com.example.testdemo

class NoteInfo (var course:CourseInfo,var title:String,var text:String){
    override fun toString(): String {
        return "${course.title} - $title"
    }
}