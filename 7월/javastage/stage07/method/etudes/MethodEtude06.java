package stage07.method.etudes;

public class MethodEtude06 {
	public static void main(String[] args) {
		int[] a = {10};
		
		callref(a);
		System.out.println("callref : " + a[0]);
		System.out.println("au revoir!");
	}

	private static void callref(int[] a) {	// call by reference : 주소에 의한 호출
		System.out.println("callref : " + a[0]);
		a[0]++;
		System.out.println("callref : " + a[0]);
	}
}
