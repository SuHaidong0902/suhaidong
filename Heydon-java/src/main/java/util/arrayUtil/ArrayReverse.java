package util.arrayUtil;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/21
 * @Description: 数组转置
 */
public class ArrayReverse {
    public static int[] Reverse(int[] data) {
        int center = data.length / 2;
        int head = 0;
        int tail = data.length - 1;
        for (int i = 0; i < center; i++) {
            int temp = data[head];
            data[head] = data[tail];
            data[tail] = temp;
            head++;
            tail--;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 4, 9};
        int[] reverseArr = ArrayReverse.Reverse(arr);
        for (int x : reverseArr) {
            System.out.println("转换后的数据：" + x);
        }

    }
}
