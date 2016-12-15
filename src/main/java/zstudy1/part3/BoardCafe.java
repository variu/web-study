package zstudy1.part3;

public class BoardCafe implements Board{
	
	private Write write;

	public BoardCafe() {
		this.setWrite(Factory.getWriteInstance());
	}

	public void setWrite(Write write) {
		this.write = write;
	}

	public void boardWrite() {
		write.doWrite();
	}
}
