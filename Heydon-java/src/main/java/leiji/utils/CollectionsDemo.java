package leiji.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author 海东
 * @Date: 2022/1/12 10:08 下午
 * @Description: 使用Collections操作List集合
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        // 集合增加元素
        Collections.addAll(all,"su","hai","Dong");
        System.out.println(all);

        // 集合反转
        Collections.reverse(all);
        System.out.println(all);

        // 使用集合排序
        Collections.sort(all);
        System.out.println(all);
        // 使用集合二分查找
        System.out.println(Collections.binarySearch(all,"su"));
    }
}
