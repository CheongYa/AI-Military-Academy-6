package stage03.operator.etudes;

import java.util.Scanner;

public class OpEtude02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : "); int a=sc.nextInt();
		System.out.print("b : "); int b=sc.nextInt();

		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		sc.close();
		System.out.println("au revoir!");
	}
}
