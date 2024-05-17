package com.amalitech.Java_lab2;

import com.amalitech.Services.Config;
import com.amalitech.Services.ServiceConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaLab2Application {

	public static void main(String[] args) {

		SpringApplication.run(JavaLab2Application.class, args);

		//Get java bean factor
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		// get the service consumer class
		var cal = context.getBean(ServiceConsumer.class);

		//test the service consumer class
		cal.calculate();
	}

}
