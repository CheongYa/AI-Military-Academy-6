package stage04.control.et05;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;

        System.out.println("1과 100 사이의 숫자를 맞춰보세요!");

        while (guess != targetNumber) {
            System.out.print("숫자 입력: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("더 큰 숫자입니다.");
            } else if (guess > targetNumber) {
                System.out.println("더 작은 숫자입니다.");
            } else {
                System.out.println("정답입니다!");
            }
        }

        scanner.close();
    }
}
