package zstudy1.part12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. 개발환경과 운영환경을 구분할 수 있는 환경을 만들어보자.
	 *    - MainApp -> 우클릭 run as -> run configuration 클릭하여 argument 탭 VM argument에 -Dspring.profiles.active=dev 입력
	 * 
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context12.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
