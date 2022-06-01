package leiji.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2021/12/14 11:13 下午
 * @Description:
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("one", 101); // key重复
        map.put(null, 0);   // key为空
        map.put("", 1);
        map.put("ten", null); // value为空
        System.out.println(map);
    }
}
