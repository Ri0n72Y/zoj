import java.util.ArrayList;
import java.util.Arrays;

public class leetCode001 {
    public static void main(String[] args) {
        int[] nums = new int[] {3, 2, 4};
        int[] result = twoSum(nums, 6);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> number = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            number.add(nums[i]);
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i ; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] r = new int[]{number.indexOf(nums[i]), number.indexOf(nums[j])};
                    Arrays.sort(r);
                    return r;
                }
            }
        }
        return null;
    }
}
