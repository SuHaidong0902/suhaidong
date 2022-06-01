package leiji.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author 海东
 * @Date: 2022/1/5 10:24 下午
 * @Description:
 */
public class MapIteratorDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 1);
        Set<Map.Entry<String, Integer>> set = map.entrySet();  // 1. 将Map集合转为Set集合
        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> me = iter.next();
            System.out.println("key = " + me.getKey() + "、value = " + me.getValue());
        }

        // 使用foreach输出
        System.out.println("------使用foreach输出------");
        for (Map.Entry<String, Integer> entry : set) {
            System.out.println("key = " + entry.getKey() + "、value = " + entry.getValue());
        }

    }
}
