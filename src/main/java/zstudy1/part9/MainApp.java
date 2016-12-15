package zstudy1.part9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. context.xml 에 빈을 일일이 등록하지 않고 component-scan 속성 주고, @Component 를 활용해보자.
	 * 2. component-scan은 최상위다. context.xml에 annontation 설정은 삭제해도 된다.
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context9.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
