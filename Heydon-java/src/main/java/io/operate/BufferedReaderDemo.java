package io.operate;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author 海东
 * @Date: 2021/7/13 11:46 下午
 * @Description: 通过缓冲字符流，实现键盘数据输入,并验证；输入一个人的生日
 */
public class BufferedReaderDemo {
    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input age：");
        String str = br.readLine();
        if (str.matches("\\d{1,3}")){
            System.out.println("age is :" + str);
        }else{
            System.out.println("please sure.");
        }
    }
}
