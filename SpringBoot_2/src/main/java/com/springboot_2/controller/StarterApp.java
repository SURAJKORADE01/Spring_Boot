package com.springboot_2.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(Suraj.class);
//        SpringApplication springApplication = new SpringApplication(StarterApp.class);
//        springApplication.run();



//        ConfigurableApplicationContext container =  springApplication.run();
//        Student student = container.getBean(Student.class);
//        System.out.println(student);
//        System.out.println("Name: "+student.getStudentName());
    }

//    @Bean   // it is also used to create the object
//    public Student createObject()
//    {
//        return new Student();
//    }
}
