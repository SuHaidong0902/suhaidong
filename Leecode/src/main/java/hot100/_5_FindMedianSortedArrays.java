package hot100;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * @Author 海东
 * @Date: 2022/2/10 10:35 下午
 * @Description: 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 输入：nums1 = [1,2], nums2 = [3,4]
 * 输出：2.50000
 * 解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
 */
public class _5_FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int lennums = len1 + len2;
        int[] nums = new int[len1 + len2];

        System.arraycopy(nums1, 0, nums, 0, len1);
        System.arraycopy(nums2, 0, nums, len1, len2);

        for (int x : nums) {
            System.out.println("\t" + x);
        }

        for (int x = 0; x < lennums; x++) {
            for (int y = x + 1; y < lennums; y++) {
                if (nums[x] > nums[y]) {
                    int temp;
                    temp = nums[x];
                    nums[x] = nums[y];
                    nums[y] = temp;
                }
            }
        }

        for (int x : nums) {
            System.out.println("\t\t" + x);
        }

        DecimalFormat df = new DecimalFormat("0.0000");
        double result = 0.00;
        df.format(result);
        if (lennums % 2 == 0) {
            int sum = nums[lennums / 2] + nums[lennums / 2 - 1];
            String temp = df.format((double) sum / (double) 2);
            result = Double.parseDouble(temp);
        }
        if (lennums % 2 == 1) {
            result = nums[lennums / 2];
        }
        return Double.parseDouble(df.format(result));
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{3, 4};
        _5_FindMedianSortedArrays fmsa = new _5_FindMedianSortedArrays();
        System.out.println(fmsa.findMedianSortedArrays(nums1, nums2));
    }
}
