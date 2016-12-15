package zstudy1.part8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. BoardCafe에서 사용한 Autowired + Qualifier 를 Resource 로 대체해보자. (스프링/자바 라이브러리 차이)
	 * 2. 어떤게 더 좋을까 고민해보자. 차이는 없다.
	 */
	public static void main(String[] args) {
		
		ApplicationContext ac = new GenericXmlApplicationContext("spring/context8.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}

}
