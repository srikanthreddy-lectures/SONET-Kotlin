package com.example.testdemo

class DataManager {

    var courses = HashMap<String,CourseInfo>()
    var notes = ArrayList<NoteInfo>()

    init {
        initCourse()
        initNote()
    }


    private fun initCourse(){
        var course = CourseInfo("sonet2021-kotlin","Android development with Kotlin")
        courses.put(course.courseID,course)

        course = CourseInfo("sonet2021-react","Web development with ReactJS")
        courses.put(course.courseID,course)

        course = CourseInfo("sonet2021-ML","ML")
        courses.put(course.courseID,course)
    }

    private fun initNote(){
        var note = NoteInfo(courses["sonet2021-kotlin"] as CourseInfo,"Activity" ,"Learning android activity")
        notes.add(note)

        note = NoteInfo(courses["sonet2021-kotlin"] as CourseInfo,"Intends" ,"Learning android Intends")
        notes.add(note)
    }
}