package leiji.map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2022/1/4 10:21 下午
 * @Description: 有序MAp
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 1);
        System.out.println(map);
    }
}
