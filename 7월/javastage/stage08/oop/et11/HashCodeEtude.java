package stage08.oop.et11;

class Point {}

public class HashCodeEtude {
	public static void main(String[] args) {
		Point p = new Point();
		System.out.printf("%x", p.hashCode());
		System.out.println("au revoir!");
	}
}
