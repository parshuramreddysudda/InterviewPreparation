package practice.PracticeSpring;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@Component
@EnableAspectJAutoProxy
public class Helper {

//	 @Pointcut("execution()")
	  @Pointcut("execution(* StudentDatabase.*(..))")
	   private void selectAll(){}

	 
	@Before("getDetails()")
	public void before(JoinPoint joinPoint) {
		System.out.println("I am Log"+joinPoint);
	}
}