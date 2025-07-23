package stage04.control.et01;

public class IfEtude01 {
	public static void main(String[] args) {
		int n = 2;

		if        (n == 1 || n == 3) {
			System.out.println("남자입니다.");
		} else if (n == 2 || n == 4) {
			System.out.println("여자입니다.");
		} else {
			System.out.println("에러입니다.");
		}

		System.out.println("au revoir!");
	}
}
