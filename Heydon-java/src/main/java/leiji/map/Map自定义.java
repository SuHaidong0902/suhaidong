package leiji.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @Author 海东
 * @Date: 2022/1/5 11:02 下午
 * @Description: 对于自定义Key类型，所在的类中一定要覆写hashCode()与equals()方法，否则无法查找到
 */
class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class Map自定义 {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        map.put(new Person("张三",18),"海东");
        System.out.println(map.get(new Person("张三",18)));
    }
}
