package stage08.oop.et01;

public class Point3D extends Point2D {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void print() { // override
		super.print();
		System.out.println("z = " + this.getZ());
		System.out.println(x);
	}
}
