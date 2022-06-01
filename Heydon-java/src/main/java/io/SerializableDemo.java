package io;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @Author 海东
 * @Date: 2021/7/21 11:01 下午
 * @Description:
 */

public class SerializableDemo {
    private static final File SAVE_FILE = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java" +
            File.separator + "IoDemo/SerializableDemo.txt");

    @SneakyThrows
    public static void main(String[] args) {
        saveObject(new Person("张三", 18));
        System.out.println(loadObject());
    }

    @SneakyThrows
    public static void saveObject(Object obj) {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        oos.writeObject(obj); // 序列化
        oos.close();
    }

    @SneakyThrows
    public static Object loadObject() {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE));
        Object obj = ois.readObject(); // 反序列化
        ois.close();
        return obj;
    }

    static class Person implements Serializable {
        private transient String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
