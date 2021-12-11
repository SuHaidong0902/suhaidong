package leiji.set;

import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author 海东
 * @Date: 2021/12/5 8:48 下午
 * @Description: HashSet 不允许保存重复元素； 保存的数据是无序的；
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> all = new HashSet<>();
        all.add("su");
        all.add("hai");
        all.add("dong");
        all.add("su");
        all.forEach(System.out::println);

    }

}
