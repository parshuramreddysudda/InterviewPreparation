package springdemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	@Pointcut("execution(public void getDetails())")
	public void getDetailsBefore() {
	}

	@Before(value = "getDetailsBefore()")
	public void beforeCallGetDetailsAOPBefore(JoinPoint joinPoint) {
		System.out.println("Involked Method name is " + joinPoint.getSignature().getName());
		System.out.println("Started at " + dtf.format(now));

	}

	@After(value = "getDetailsBefore()")
	public void afterCallGetDetailsAOPAfter(JoinPoint joinPoint) {
		System.out.println("Method " + joinPoint.getSignature().getName() + " Execution has been completed");
	}
	
	@Pointcut("execution(public void getStudent(..))")
	public void getStudentDetails() {
	}
	

	@Before(value = "getStudentDetails()")
	public void getStudentDetailsAOPBefore(JoinPoint joinPoint) {
		System.out.println("Involked Method name is " + joinPoint.getSignature().getName());
		 Object[] signatureArgs = joinPoint.getArgs();
		 for (Object signatureArg: signatureArgs) 
		      System.out.println("Arguments are: " + signatureArg);
	}
	
	@After(value = "getStudentDetails()")
	public void getStudentDetailsAOPAfter(JoinPoint joinPoint) {
		System.out.println("Method " + joinPoint.getSignature().getName() + " Execution has been completed");
	}

//	
//	@Before("execution (public void getDetails())")
//	public void detailsExecuted() {
//		System.out.println("Hello wolrd");
//	}
}
