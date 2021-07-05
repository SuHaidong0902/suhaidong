package util.commonUtil;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/24
 * @Description: 挽救比较器，用于设计不合理时的挽救
 */

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Person[] per = new Person[]{
                new Person("hai-A", 25),
                new Person("hai-B", 18),
                new Person("hai-C", 28)
        };
        Arrays.sort(per);
        System.out.println(Arrays.toString(per));
    }
}
