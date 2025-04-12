import java.util.Scanner;

public class lab1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Число должно быть трехзначным!");
            return;
        }

        int a = number / 100;    
        int b = (number / 10) % 10;
        int c = number % 10; 

        int sum = a + b + c;
        int product = a * b * c;

        boolean isTwiceEven = (sum % 2 == 0) && (product % 2 == 0);

        if (isTwiceEven) {
            System.out.println("Число является дважды четным.");
        } 
        else {
            System.out.println("Число не является дважды четным.");
        }
        scanner.close();
    }
}
