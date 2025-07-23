package stage04.control.et03;

public class ForEtude03 {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=3; i<=1000; i+=3) { // 1부터 1000까지 3의 배수의 합계
			sum += i;
		}
		System.out.println("1부터 1000까지 3의 배수의 합계는 " + sum);
		System.out.println("au revoir!");
	}
}
