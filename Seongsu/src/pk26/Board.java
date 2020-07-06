package pk26;

public class Board {

		String subject;
		String content;
		String writer;
		public Board(String subject, String content, String writer) {
			this.subject=subject;
			this.content=content;
			this.writer=writer;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "책이름 : "+subject+" 장르 : "+content+" 작가"+writer;
		}
		
		

}
