package stage07.method.etudes;

public class MethodEtude02 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println(a + "-" + b + "=" + sub(a, b));
		System.out.println(a + "*" + b + "=" + mul(a, b));
		System.out.println(a + "/" + b + "=" + div(a, b) + "…" + mod(a, b));
		System.out.println("au revoir!");
	}

	private static int mod(int a, int b) {
		return a%b;
	}

	private static int div(int a, int b) {
		return a/b;
	}

	private static int mul(int a, int b) {
		return a*b;
	}

	private static int sub(int a, int b) {
		return a-b;
	}

	private static int add(int a, int b) {
		return a + b;
	}
}
