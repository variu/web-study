package zstudy1.part7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. Q&A 게시판이 더생성되었을 때, 컨텍스트 빈 등록 후 각 빈을 BoardCafe 클래스에 @Qualifier로 DI 시켜보자
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context7.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
