import java.util.Scanner;

public class lab1_1{ 
      public static void main() {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int steps = numOfSteps(p);
        System.out.println(steps);
        scanner.close();
    }

    public static int numOfSteps(int n) {
        int steps = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            steps++;
        }

        return steps;
    }
}
