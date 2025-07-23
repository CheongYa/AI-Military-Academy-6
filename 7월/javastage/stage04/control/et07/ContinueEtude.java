package stage04.control.et07;

public class ContinueEtude {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // 3은 건너뜀
            }
            System.out.println("i = " + i);
        }

		System.out.println("au revoir!");
    }
}