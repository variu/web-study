package zstudy1.part10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. @PostConstruct 를 써서 DI 될 때 메서드가 호출되게 해보자
	 * 
	 * 2. AOP를 사용해보자.
	 *    - pom.xml에 spring aop와 aspectj weaver 디펜던시 추가
	 *    - context.xml 에 aop 관련 추가
	 * 
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context10.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
