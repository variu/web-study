package zstudy1.test2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("body")
public class Body {

	@Autowired
	private Conn conn;
	
	@PostConstruct
	public void connection() {
		System.out.println("연결 실행");
	}
	
	public void boardWrite() {
		System.out.println("글 쓰기 처리");
	}
	
	@PreDestroy
	public void close() {
		System.out.println("연결 해제");
		conn = null;
	}
}
