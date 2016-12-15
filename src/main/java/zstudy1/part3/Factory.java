package zstudy1.part3;

import zstudy1.part3.Write;

public class Factory {
	public static Write getWriteInstance(){
		return new FreeBoardWrite();
	}
	public static Board getBoardInstance(){
		return new BoardCafe();
	}
}
