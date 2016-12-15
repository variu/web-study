package zstudy1.part12;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("profiler")
public class Profiler {
	
	@Pointcut("execution(public * zstudy1.part12..*(..))")
	public void publicMethod(){}
	
	@Around("publicMethod()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("profiler == Before || " + joinPoint.getSignature().toShortString());
		
		try {
			System.out.println("이 시스템은 " + System.getProperty("spring.profiles.active") + " 입니다.");
			
			// around 속성이라면 이거 기준으로 전처리/후처리 다 한다.
			Object result = joinPoint.proceed();
			return result;
		} 
		finally {
			System.out.println("profiler == After || " + joinPoint.getSignature().toShortString());
		}
		
	}

}
