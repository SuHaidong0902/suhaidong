package leiji.list;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author 海东
 * @Date: 2021/12/5 8:02 下午
 * @Description:
 */
public class LindedListDemo {
    public static void main(String[] args) {
        List<String> all = new LinkedList<String>();
        all.add("hello");
        all.add("hai");
        all.add("dong");
        all.add("dong");
        all.forEach(System.out::println);
    }
}
