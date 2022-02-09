package hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2022/2/8 11:26 下午
 * @Description: 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。
 * 请你返回 nums 中唯一元素的 和 。
 */
public class SumOfUnique {
    public int sumOfUnique(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<>(len);
        int sum = 0;
        for (int num : nums){
            if (!map.containsKey(num)){
                sum += num;
                map.put(num,0);
            }else if(map.get(num) == 0){
                sum -= num;
                map.put(num,1);
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        int[] nums = new int []{1,1,1,2,3};
        SumOfUnique s = new SumOfUnique();
        System.out.println(s.sumOfUnique(nums));
    }
}
