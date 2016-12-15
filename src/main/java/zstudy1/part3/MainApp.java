package zstudy1.part3;

public class MainApp {

	/*
	 * 강결합을 해소하기 위한 팩토리 패턴 사용, 인터페이스 활용
	 */
	public static void main(String[] args) {
		Board board = Factory.getBoardInstance();
		board.boardWrite();
	}

}
