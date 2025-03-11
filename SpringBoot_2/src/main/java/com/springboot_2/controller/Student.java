package com.springboot_2.controller;

import org.springframework.stereotype.Component;

//@Component
//Either we can create the object using Component aanotation or by using the @Beam aanotation
public class Student
{
    String studentName = "Suraj";

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student()
    {

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
