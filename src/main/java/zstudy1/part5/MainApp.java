package zstudy1.part5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. DI / @autowired를 통한 의존성주입
	 * 2. Context5 에 어노테이션 설정하기!
	 * 3. Factory 객체가 필요없어진다.
	 * 
	 * 4. context5.xml에 init-method 속성 줘보자.
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context5.xml");
		
		/*
		Board board = Factory.getBoardInstance();
		*/
		
//		Board board = ac.getBean("board", Board.class);
		Board board = (Board)ac.getBean("board");
		board.boardWrite();
	}

}
