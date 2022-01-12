package leiji.map;

import leiji.intertor.IntertorDemo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2021/12/13 11:59 下午
 * @Description: map处理的最标准处理形式；key重复，会覆盖；key或value可以为空；
 * put()方法有返回值，key重复的时候，返回旧的value
 */
public class Mapdemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("one",101); // key重复
        map.put(null,0);   // key为空
        map.put("",1);
        map.put("ten",null); // value为空
        System.out.println(map);
        System.out.println();
    }
}
