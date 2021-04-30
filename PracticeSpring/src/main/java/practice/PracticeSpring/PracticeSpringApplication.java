package practice.PracticeSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "practice.PracticeSpring")
@SpringBootApplication
public class PracticeSpringApplication {

	public static void main(String[] args) {

		ApplicationContext application = SpringApplication.run(PracticeSpringApplication.class, args);
		StudentDatabase student=application.getBean(StudentDatabase.class);
		student.getDetails();
//		student.getStudent(2);
	}

}
