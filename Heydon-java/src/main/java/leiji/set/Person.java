package leiji.set;

import java.util.Objects;

/**
 * @Author 海东
 * @Date: 2021/12/5 9:20 下午
 * @Description:
 */
public class Person implements Comparable<Person> { // 比较器
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + "、年龄：" + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person per) {
        if (this.age < per.age) {
            return -1;
        }
        if ((this.age > per.age)) {
            return 1;
        }
        return this.name.compareTo(per.name);
    }
}
