package pk26;


import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		Board board1 = new Board("��", "�̺�", "�輳��");
		Board board2 = new Board("���", "���", "������");
		Board board3 = new Board("������", "��������", "����");
		Board board4 = new Board("����������", "������ȭ", "�����");
		Board board5 = new Board("���̽�", "������", "������");
		
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
