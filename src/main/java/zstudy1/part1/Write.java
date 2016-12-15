package zstudy1.part1;

public class Write {
	
	private String sBoardName;
	
	public Write(){
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
