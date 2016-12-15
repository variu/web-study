package zstudy1.part10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("profiler")
public class Profiler {
	
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("profiler == Before || " + joinPoint.getSignature().toShortString());
		
		try {
			// around 속성이라면 이거 기준으로 전처리/후처리 다 한다.
			Object result = joinPoint.proceed();
			return result;
		} 
		finally {
			System.out.println("profiler == After || " + joinPoint.getSignature().toShortString());
		}
		
	}

}
