package stage06.text.etudes;

public class StringEtude01 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		String str = new String("문자열");
		
		String str2= "";
		for(int i=1; i<= 3; i++) {
			str2 += "ABC";
		}
		System.out.println(str2);
		System.out.println("ABCDE".substring(2,4));
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a == b);
		System.out.println(a.equals(b));
		String a2 = "Hello";
		String b2 = "Hello";
		System.out.println(a2 == b2);
		System.out.println("au revoir!");
	}
}
