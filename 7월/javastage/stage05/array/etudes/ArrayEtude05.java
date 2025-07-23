package stage05.array.etudes;

public class ArrayEtude05 {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]:" + args[i]);
		}
		System.out.println();
		for (String str : args) {
			System.out.println(str);
		}
		System.out.println("au revoir!");
	}
}