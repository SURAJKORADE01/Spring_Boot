package com.SpringBoot_3.SpringBoot_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("application.properties")
public class SpringBoot3Application
{
	public static void main(String[] args)
	{
		ConfigurableApplicationContext container =  SpringApplication.run(SpringBoot3Application.class, args);
		MyApp myApp =  container.getBean(MyApp.class);
		System.out.println(myApp.getAppName());
		System.out.println(myApp.getAppVersion());
		System.out.println(myApp.getDescription());
	}
}
