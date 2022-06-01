package leiji.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2022/1/4 10:30 下午
 * @Description: K、V不能为空
 */
public class HashtableDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new Hashtable<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 1);
        System.out.println(map);
    }
}
