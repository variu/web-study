package zstudy1.part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{
	
	@Autowired
//	@Qualifier("freeWrite")
	@Qualifier("qnaWrite")
	private Write write;

	public void boardWrite() {
		write.doWrite();
	}
}
