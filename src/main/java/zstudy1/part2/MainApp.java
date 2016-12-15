package zstudy1.part2;

public class MainApp {

	/*
	 * part1의 Write 객체를 FreeBoardWrite로 바꿨을 때 다른 객체까지 바궈줘야 하는 강결합에 대한 설명
	 */
	public static void main(String[] args) {
		Board board = new Board();
		board.boardWrite();
	}

}
