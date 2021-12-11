package leiji.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author 海东
 * @Date: 2021/12/5 9:00 下午
 * @Description:
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<>();
        all.add("su");
        all.add("hai");
        all.add("dong");
        all.add("su");
        all.forEach(System.out::println);
    }
}
