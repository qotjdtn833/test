package pk26;


import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		Board board1 = new Board("연", "이별", "김설하");
		Board board2 = new Board("고백", "사랑", "이정혜");
		Board board3 = new Board("생물학", "생물과학", "다윈");
		Board board4 = new Board("도깨비방망이", "전래동화", "김덕배");
		Board board5 = new Board("다이스", "스릴러", "정형석");
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		list.add(board4);
		list.add(board5);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}
		
		System.out.println("============================");
		
		list.remove(2);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.content+"\t"+board.writer);
		}

	}

}
