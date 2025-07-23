package stage04.control.et05;

public class DoWhileEtude3 {
	public static void main(String[] args) {
		// 1~1000까지 4의 배수의 합계
		
		int sum = 0;
		int i=1;
		do {
			if (i % 4 == 0) {
				sum += i;
			}
			i++;
		} while(i <= 1000);
		System.out.println(sum);
		System.out.println("au revoir!");
	}
}
