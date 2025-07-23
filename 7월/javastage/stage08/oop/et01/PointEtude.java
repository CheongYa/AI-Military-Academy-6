package stage08.oop.et01;

public class PointEtude {
	public static void main(String[] args) {
		Point2D pt = new Point2D();
		pt.x = 100;
		
		pt.setX(100);
		pt.setY(200);
		//pt.setZ(300);
		pt.print();
		System.out.println("au revoir!");
	}
}
