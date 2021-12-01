package leiji.list;

import java.util.ArrayList;

/**
 * @Author 海东
 * @Date: 2021/12/1 11:14 下午
 * @Description:
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();
        System.out.println("集合是否为空？" + all.isEmpty() + "集合元素个数" + all.size());
        all.add("hello");
        all.add("hai");
        all.add("dong");
        all.add("dong");
        all.remove("dong");
        System.out.println("集合是否为空？" + all.isEmpty() + "集合元素个数" + all.size());
        all.forEach((str)->{
            System.out.print(str + "、");
        });


    }
}
