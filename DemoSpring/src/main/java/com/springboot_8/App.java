package com.springboot_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        This line is used to create the container
//      ApplicationContext -> Is an interface so we have to create the reference of such class which implements
//        the ApplicationContext and that class is ClassPathXmlApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev dobj = (Dev) context.getBean("dev1");
        dobj.build();

//        dobj.setAge();
//        System.out.println("Value of A is: "+dobj.getAge());
    }
}
