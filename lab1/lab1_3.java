import java.util.Scanner;

public class lab1_3{ 
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int currentX = 0;
        int currentY = 0;

        int steps = 0;

        while (true) {
            String direction = scanner.next();

            if (direction.equals("стоп")) {
                break;
            }

            int distance = scanner.nextInt();

            switch (direction) {
                case "север":
                    currentY += distance;
                    break;
                case "юг":
                    currentY -= distance;
                    break;
                case "запад":
                    currentX -= distance;
                    break;
                case "восток":
                    currentX += distance;
                    break;
            }
            steps++;

            if (currentX == x && currentY == y) {
                break;
            }
        }
        System.out.println(steps);
        scanner.close();
    }
}
