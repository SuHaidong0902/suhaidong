package io.operate;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @Author 海东
 * @Date: 2021/7/9 12:39 上午
 * @Description: 打印流，数据输出
 */
public class PrintIODemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java"+
                File.separator + "IoDemo/PrintIODemo.txt");
        PrintWriter pu = new PrintWriter(new FileOutputStream(file));
        String name = "小A";
        int age = 18;
        double salary = 54386.9758;
        pu.printf("姓名：%s，年龄：%d，收入：%1.2f",name,age,salary,true);
        pu.close();

    }
}
