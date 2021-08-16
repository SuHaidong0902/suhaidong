package io.operate;

import lombok.SneakyThrows;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @Author 海东
 * @Date: 2021/7/14 12:06 上午
 * @Description: 使用Scanner实现键盘数据输入;输入生日，并验证
 */
public class ScannerDemo {
    @SneakyThrows
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("please input birth :");
        if (scan.hasNext()){
            String birth = scan.next("\\d{4}-\\d{2}-\\d{2}");
            System.out.println("your birth :" + new SimpleDateFormat("yyyy-MM-dd").parse(birth));
        }else{
            System.out.println("wrong input.");
        }*/


        Scanner scan = new Scanner(new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java" +
                                File.separator + "IoDemo/Scanner.txt"));
        scan.useDelimiter("/n");
        while (scan.hasNext()){
            System.out.println(scan.next());
        }
    }
}
