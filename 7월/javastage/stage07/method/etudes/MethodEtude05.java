package stage07.method.etudes;

public class MethodEtude05 {
	public static void main(String[] args) {
		int a = 10, b = 5;
		System.out.println(a + "+" + b + "=" + add(a, b));
		System.out.println("main a:" + a);
		System.out.println("au revoir!");
	}
	private static int add(int a, int b) {	// call by value : 값에 의한 호출
		int sum = a + b;
		a++;
		System.out.println("add  a:" + a);
		return sum;
	}
}
