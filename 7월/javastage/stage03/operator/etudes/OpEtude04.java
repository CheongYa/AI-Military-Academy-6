package stage03.operator.etudes;

public class OpEtude04 {
	public static void main(String[] args) {
		
        int a, b;

        a = 5;  // 00000000 00000000 00000000 00000101
        b = 3;  // 00000000 00000000 00000000 00000011
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));

		System.out.println("au revoir!");
	}
}
