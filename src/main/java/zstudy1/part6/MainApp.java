package zstudy1.part6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. BoardCafe Autowired 위치를 바꾸로 setter도 주석처리 해보자
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context6.xml");
		
		Board board = (Board)ac.getBean("board");
		board.boardWrite();
	}

}
