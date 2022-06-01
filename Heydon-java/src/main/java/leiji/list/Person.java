package leiji.list;

import lombok.Data;

/**
 * @Author 海东
 * @Date: 2021/12/5 7:39 下午
 * @Description:
 */
@Data
public class Person {
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
}
