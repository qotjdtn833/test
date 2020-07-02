package pk24;

public class Point<T, V> {
	T x; // int x;
	V y;//  double y; ¶û °°ÀºÇü½Ä
	
	Point(T x, V y){
		this.x=x;
		this.y=y;
	}
	
	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}

}
