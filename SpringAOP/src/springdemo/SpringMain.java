package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentDatabase stu = context.getBean(StudentDatabase.class);
		stu.getDetails();
		System.out.println("================================================");
		stu.getStudent(3);
	}
}
