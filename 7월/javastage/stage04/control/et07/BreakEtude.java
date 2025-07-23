package stage04.control.et07;

public class BreakEtude {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // i가 3이면 반복문 종료
            }
            System.out.println("i = " + i);
        }

        System.out.println("au revoir!");
    }
}