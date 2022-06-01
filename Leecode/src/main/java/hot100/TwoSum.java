package hot100;

import java.util.HashMap;

/**
 * @Author 海东
 * @Date: 2022/2/8 10:35 下午
 * @Description: 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，
 * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two solution....");
    }

    public int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> result = new HashMap<>(len - 1);
        for (int i = 0; i < len; i++) {
            if (result.containsKey(target - nums[i])) {
                return new int[]{result.get(target - nums[i]), i};
            }
            result.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two solution....");
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        TwoSum s = new TwoSum();
        int[] result = s.twoSum2(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
