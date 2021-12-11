package leiji.intertor;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author 海东
 * @Date: 2021/12/7 11:40 下午
 * @Description: 集合输出
 */
public class IntertorDemo {
    public static void main(String[] args) {
        Set<String> all = new TreeSet<>();
        all.add("su");
        all.add("hai");
        all.add("dong");
        all.add("su");

        Iterator<String> iter = all.iterator(); // 实例化iterator对象
        while (iter.hasNext()){
            String str = iter.next();
            if ("su".equals(str)){
                iter.remove();
            }else{
            System.out.println(str);}
        }
        System.out.println("******" + all);
    }

}
