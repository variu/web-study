package zstudy1.part6;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardCafe implements Board{
	
	@Autowired
	private Write write;
/*
	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}
	
	public void setWrite(Write write) {
		this.write = write;
	}
 */

	public void boardWrite() {
		write.doWrite();
	}
}
