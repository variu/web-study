package zstudy1.part10;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("qnaWrite")
public class QnABoardWrite implements Write {
	
	private String sBoardName;
	
	/*
	public QnABoardWrite(){
		this.init();
	}
	*/
	@PostConstruct
	public void init(){
		this.setsBoardName("Q&A Board");
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
