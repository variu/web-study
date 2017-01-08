package zstudy1.test2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	/*
	 * 1. 2부 강의 전 테스트 한번 더 해보기
	 * ConfigurableApplicationContext 을 쓰는 이유는 전처리, 후처리 사용하기 위함
	 * 
	 */
	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac = new GenericXmlApplicationContext("spring/context-test2.xml");
		
		Body body = cac.getBean("body",Body.class);
		body.boardWrite();
		
		cac.close();
		
	}

}
