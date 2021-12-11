package leiji.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author 海东
 * @Date: 2021/12/5 9:14 下午
 * @Description: 实现自定义类排序，TreeSet必须实现Comparable
 * Exception in thread "main" java.lang.ClassCastException:
 * leiji.set.Person cannot be cast to java.lang.Comparable
 */
public class TreeSetClass {
    public static void main(String[] args) {
        Set<Person> all = new HashSet<>();
        // Set<Person> all = new TreeSet<>();
        all.add(new Person("zhangsan",18));
        all.add(new Person("lisi",20));
        all.add(new Person("wangwu",18));
        all.add(new Person("zhangsan",28));
        all.add(new Person("zhangsan",18));
        all.forEach(System.out::println);


    }
}
