package fanshe;

import lombok.SneakyThrows;

/**
 * @Author 海东
 * @Date: 2021/8/18 11:57 下午
 * @Description:
 */
class Person{}
public class test {
    @SneakyThrows
    public static void main(String[] args) {
       /* Class<?> cls = Person.class;
        System.out.println(cls.getName());*/
        Class<?> cls = Class.forName("fanshe.Person");
        System.out.println(cls.getName());
    }
}
