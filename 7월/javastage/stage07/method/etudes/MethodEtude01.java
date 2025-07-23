package stage07.method.etudes;

public class MethodEtude01 {
	int i;
	public static void main(String[] args) {
		print("신해철");
		print("서태지");
		print();     // method overload (메소드 중복정의)
		
		System.out.println("au revoir!");
	}

	private static void print() {
		System.out.println("안녕하세요");
	}

	private static void print(String name) { // behavior
		System.out.println("+--------+");
		System.out.println("| "+ name +" |");
		System.out.println("+--------+");
		return;
	}
}
