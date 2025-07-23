package stage03.operator.etudes;

public class OpEtude11 {
	public static void main(String[] args) {
		// 조건 연산자와 Scanner를 이용하여 입력된 수가 홀수인지 짝수인지 판별
		// 아래 프로그램은 25% 오류가 발생함.
		int a = 5;

		System.out.println(a + (a % 2 == 1 ? "는 홀수입니다." : "는 짝수 입니다."));
		System.out.println("au revoir!");
	}
}
