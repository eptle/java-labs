import java.util.Scanner;

public class lab1_2{ 
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int sign = 1;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            sum += sign * number;
            sign *= -1;
        }
        System.out.println(sum);

        scanner.close();
    }
}
