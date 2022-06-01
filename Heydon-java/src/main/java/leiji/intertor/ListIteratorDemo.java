package leiji.intertor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author 海东
 * @Date: 2021/12/8 10:39 下午
 * @Description: 实现双向输出, 使用hasPrevious()前，必须先使用hasNext()；指针！
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("su");
        all.add("hai");
        all.add("dong");
        all.add("su");
        ListIterator<String> iter = all.listIterator();
        System.out.println("由前向后输出：");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "、");
        }
        System.out.println("\n由后向前输出:");
        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + "、");
        }

    }
}
