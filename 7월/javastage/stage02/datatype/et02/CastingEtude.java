package stage02.datatype.et02;

public class CastingEtude {
	public static void main(String[] args) {
		int n = (int) 0.9999;	// 강제형변환, 명시적형변환, down casting
		System.out.println(n);
		
		double d = 10;			// 자동형변환, 묵시적형변환, up casting
		System.out.println(d);
		
		System.out.println("au revoir!");
	}
}
