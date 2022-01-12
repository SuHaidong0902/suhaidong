package leiji.utils;

import java.util.Stack;

/**
 * @Author 海东
 * @Date: 2022/1/6 10:38 下午
 * @Description:
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<String> all = new Stack<>();
        all.push("A");
        all.push("B");
        all.push("C");
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop());
        System.out.println(all.pop()); // 无数据  抛出EmptyStackException异常
    }
}
