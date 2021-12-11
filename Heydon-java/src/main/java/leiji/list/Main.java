package leiji.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 海东
 * @Date: 2021/12/5 7:42 下午
 * @Description: 自定义类实现ArrayList
 */
public class Main {
    public static void main(String[] args) {
        List<Person> all = new ArrayList<Person>();
        all.add(new Person("zhangsa",18));
        all.add(new Person("lisi",20));
        all.add(new Person("wangwu",28));
        System.out.println(all.contains(new Person("wangwu",28)));
        all.remove(new Person("wangwu",28));
        all.forEach(System.out::println);
    }
}
