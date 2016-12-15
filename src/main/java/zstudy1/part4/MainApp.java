package zstudy1.part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. 강결합을 해소하기 위한 팩토리 패턴 사용, 인터페이스 활용
	 * 2. 스프링 컨테이너를 활용, 빈에 등록하여 사용까지!
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context4.xml");
		
		/*
		Board board = Factory.getBoardInstance();
		*/
		
//		Board board = ac.getBean("board", Board.class);
		Board board = (Board)ac.getBean("board");
		board.boardWrite();
	}

}
