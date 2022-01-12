package leiji.utils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 海东
 * @Date: 2022/1/6 10:51 下午
 * @Description: 使用优先级队列，可以用PriorityQueue（使用了Comparable），把LinkedList换一下
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> all = new LinkedList<>();
        all.offer("A"); // 追加队列数据，通过队尾追加
        all.offer("B"); // 追加队列数据，通过队尾追加
        all.offer("D"); // 追加队列数据，通过队尾追加
        all.offer("A"); // 追加队列数据，通过队尾追加
        System.out.println(all.poll()); // 弹出数据 A
        System.out.println(all.poll()); // 弹出数据 B
        System.out.println(all.poll()); // 弹出数据 D
        System.out.println(all.poll()); // 弹出数据 A
    }
}
