import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {// TC: O(n), SC: O(n)

    public static int[] twoSum(int[] nums, int target) {
        int [] ans = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                ans[0] = i;
                ans[1] = map.get(diff);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] input = {3, 5, 7, 6, 10};
        int target = 12;
        Arrays.stream(twoSum(input, 12)).forEach(System.out::println);

    }
}
