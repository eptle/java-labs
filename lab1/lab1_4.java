import java.util.Scanner;

public class lab1_4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int maxHeight = 0; 
        int bestRoad = 0; 

        for (int roadNumber = 1; roadNumber <= n; roadNumber++) {
            int tunnelCount = scanner.nextInt();
            int minHeightOnRoad = Integer.MAX_VALUE;

            for (int i = 0; i < tunnelCount; i++) {
                int tunnelHeight = scanner.nextInt();

                if (tunnelHeight < minHeightOnRoad) {
                    minHeightOnRoad = tunnelHeight;
                }
            }

            if (minHeightOnRoad > maxHeight) {
                maxHeight = minHeightOnRoad;
                bestRoad = roadNumber;
            }
        }
        System.out.println(bestRoad + " " + maxHeight);
        scanner.close();
    }
}
