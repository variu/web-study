package zstudy1.part11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. AOP를 어노테이션으로 해보자
	 * 
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context11.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
