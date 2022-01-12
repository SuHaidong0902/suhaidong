package leiji.utils;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @Author 海东
 * @Date: 2022/1/6 11:38 下午
 * @Description: 将属性能容保存在文件之中
 */
public class Propertiesdemo {
    @SneakyThrows
    public static void main(String[] args) {
        String dir = "/Users/haidong/Downloads/javaCode/suhaidong/Heydon-java/src/main/java/leiji/utils/info.propertoes";
        Properties prop = new Properties();
        // 设置内容只允许是字符串
        prop.setProperty("su","haidong");
        prop.setProperty("hai","dongdong");
        System.out.println(prop.getProperty("hai"));
        System.out.println(prop.getProperty("su"));
        System.out.println(prop.getProperty("duixiang"));
        System.out.println(prop.getProperty("duixiang","NoFound"));

        // 将属性能容保存在文件之中
        prop.store(new FileOutputStream(dir),"中文是看不到的-English");

        // 读取资源文件
        prop.load(new FileInputStream(dir));
        System.out.println("---------------------------");
        System.out.println(prop.getProperty("su"));

    }
}
