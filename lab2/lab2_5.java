import java.util.HashSet;

public class lab2_5 {
    public static int[] findPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return new int[]{complement, num};
            }
            seen.add(num);
        }

        return null;
    }

    public static void main() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findPairWithSum(nums, target);

        if (result != null) {
            System.out.println("Пара: " + result[0] + " + " + result[1]);
        } else {
            System.out.println("Пара с суммой " + target + " не найдена.");
        }
    }
}
