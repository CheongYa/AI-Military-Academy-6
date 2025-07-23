package stage07.method.etudes;

public class MethodEtude03 {
	public static void main(String[] args) {
		System.out.println("주사위 값은 : " + dice());
		System.out.println("au revoir!");
	}

	private static int dice() {
		return (int)(Math.random()*6+1);
	}
}
