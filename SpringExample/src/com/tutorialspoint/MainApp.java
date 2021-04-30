package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springdemo.StudentDatabase;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext application = new AnnotationConfigApplicationContext(MainApp.class);
		
		StudentDatabase student=application.getBean(StudentDatabase.class);
		student.getDetails();
		
	}
}  