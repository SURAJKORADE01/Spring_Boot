package com.SpringBoot_73.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

//		Dev dobj = new Dev();

//		Here we inject the D using SB
		Dev dobj = context.getBean(Dev.class);
		dobj.build();
	}
}
