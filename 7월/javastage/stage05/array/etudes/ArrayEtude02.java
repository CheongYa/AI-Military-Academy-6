package stage05.array.etudes;

public class ArrayEtude02 {
	public static void main(String[] args) {
		
		//int[] s = new int[] {100, 200, 300};
		
		int[] s = {100, 200, 300};
		int len = s.length;
		for(int i=0; i < len; i++) {
			System.out.println(s[i]);
		}
		for(int n:s) {
			System.out.println(n);
		}
		System.out.println("au revoir!");
	}
}
