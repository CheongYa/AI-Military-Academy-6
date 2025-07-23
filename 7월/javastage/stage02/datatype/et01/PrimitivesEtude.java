package stage02.datatype.et01;

public class PrimitivesEtude {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);

		byte b2 = 127; // -128 ~ 127
		System.out.println(b2);

		char c = '뷁'; // 0~65535 까지 각 문자가 매핑
		System.out.println(c);

		int i = 2147483647 + 1; // 20억, 4바이트
		System.out.println(i);

		short sh = 32767; // -32768 ~ 32767, 2바이트
		System.out.println(sh);

		long lo = 2147483648L; // 8바이트, ±900경
		System.out.println(lo);

		double d = 3.1415926535; // 8바이트
		System.out.println(d);

		float f = 3.1415926535f; // 4바이트
		System.out.println(f);

		System.out.println("au revoir!");
	}
}
