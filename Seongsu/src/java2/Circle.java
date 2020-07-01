package java2;

public class Circle implements Cloneable {

		
	
		Point point; 
		int radius;
		
		Circle(int x, int y, int radius){
			this.point = new Point(x,y);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "원점은"+point+"이고,반지름은"+radius+"입니다";
		}


}

