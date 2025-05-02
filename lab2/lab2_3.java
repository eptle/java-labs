import java.util.Arrays;

public class lab2_3 {
    public static int[] findMaxSubarray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxCurrent + nums[i]) {
                maxCurrent = nums[i];
                tempStart = i;
            } else {
                maxCurrent += nums[i];
            }

            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
                start = tempStart;
                end = i;
            }
        }

        return Arrays.copyOfRange(nums, start, end + 1);
    }

    public static void main() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] subarray = findMaxSubarray(nums);

        int sum = Arrays.stream(subarray).sum();

        System.out.println("Максимальная сумма подмассива: " + sum);
        System.out.println("Подмассив: " + Arrays.toString(subarray));
    }
}
