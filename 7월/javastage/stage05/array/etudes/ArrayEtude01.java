package stage05.array.etudes;

public class ArrayEtude01 {
	public static void main(String[] args) {
		
		int[] s = new int[3];
		s[0] = 100;
		s[1] = 200;
		s[2] = 300;

		int len = s.length;
		for(int i=0; i < len; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("au revoir!");
	}
}
