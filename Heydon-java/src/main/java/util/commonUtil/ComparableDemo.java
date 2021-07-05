package util.commonUtil;

import lombok.Data;

import java.util.Arrays;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/24
 * @Description: 比较器，最常用
 */
@Data
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}' + '\n';
    }

    @Override
    public int compareTo(Person per) {
        return this.age - per.age;
    }
}

public class ComparableDemo {
    public static void main(String[] args) {
        Person[] perArray = new Person[]{
                new Person("su-A", 18),
                new Person("su-B", 28),
                new Person("su-C", 12)
        };
        Arrays.sort(perArray);
        System.out.println(Arrays.toString(perArray));
    }
}
