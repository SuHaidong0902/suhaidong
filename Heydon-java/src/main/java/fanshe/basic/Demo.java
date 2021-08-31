package fanshe.basic;

import lombok.SneakyThrows;
import sun.misc.Unsafe;

/**
 * @Author 海东
 * @Date: 2021/8/23 11:40 下午
 * @Description:
 */
class Person{
    public Person(){
        System.out.println("Constructor");
    }
    @Override
    public String toString() {
        return "toString demo";
    }
}
public class Demo {
    @SneakyThrows
    public static void main(String[] args) {
        Class<?> cls = Class.forName("fanshe.basic.Person");
        // Object obj = cls.newInstance();
        Object obj = cls.getDeclaredConstructor().newInstance();
        System.out.println(obj);
    }
}
