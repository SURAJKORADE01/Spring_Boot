package com.SpringBoot_5.SpringBoot_5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.NewPackage","com.SpringBoot_5.SpringBoot_5"})
// EnableAutoConfiguration -> Start the application of server -> tomcat, dispatcher server
// ComponentScan -> use to scan the package
// AutoConfiguration -> configuration class la configure karto -> class chya object la manage karne

public class SpringBoot5Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringBoot5Application.class, args);
	}
}
