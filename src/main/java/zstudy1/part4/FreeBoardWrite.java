package zstudy1.part4;

public class FreeBoardWrite implements Write {
	
	private String sBoardName;
	
	public FreeBoardWrite(){
		this.init();
	}
	
	public void init(){
		this.setsBoardName("Free Board");
	}

	public String getsBoardName() {
		return sBoardName;
	}

	public void setsBoardName(String sBoardName) {
		this.sBoardName = sBoardName;
	}
	
	public void doWrite(){
		System.out.println(this.getsBoardName() + " Write down!!");
	}
}
