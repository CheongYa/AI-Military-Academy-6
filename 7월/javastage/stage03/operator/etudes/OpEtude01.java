package stage03.operator.etudes;

public class OpEtude01 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("a : "); int a=sc.nextInt();
		System.out.print("b : "); int b=sc.nextInt();

		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / (double) b)); // 정수와 정수의 연산 결과는 정수
		System.out.println(a + "%" + b + "=" + (a % b));
		sc.close();
		System.out.println("au revoir!");
	}
}
