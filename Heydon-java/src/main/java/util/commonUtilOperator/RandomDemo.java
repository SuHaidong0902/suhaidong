package util.commonUtilOperator;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author haiDong
 * @Date: 2021/6/16 11:49 下午
 * @Description: 利用Random产生5个1~30之间的随机整数
 */
class NumberFactory {
    private static final Random RANDOM = new Random();

    public static int[] create(int len) {
        int[] data = new int[len];
        int foot = 0;
        while (foot < data.length) {
            int num = RANDOM.nextInt(30);
            if (num != 0) {
                data[foot++] = num;
            }
        }
        return data;
    }
}

/**
 * @author suhaidong
 */
public class RandomDemo {
    public static void main(String[] args) {
        int[] result = NumberFactory.create(5);

        System.out.println(Arrays.toString(result));
    }
}
