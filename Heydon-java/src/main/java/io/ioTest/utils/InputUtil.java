package io.ioTest.utils;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author 海东
 * @Date: 2021/8/3 10:32 下午
 * @Description: 输入三个数字，求最大值，最小值
 * 定义输入程序类
 */
public class InputUtil {
    private InputUtil(){}
    public static String getString(String prompt){
        String str = null;
        boolean flag = true;
        while (flag){
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            if (scanner.hasNext()){
                str = scanner.next().trim();
                if (!"".equals(str)){
                    flag = false;
                }else {
                    System.out.println("输入的内容不允许为空");
                }
            }else {
                System.out.println("输入的内容不允许为空");
            }
        }
        return str;
    }

    /**
     * 实现键盘接收
     * @param prompt
     * @return 可以使用的数字
     */
    @SneakyThrows
    public static int getInt(String prompt){
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean flag = true;
        while (flag) {
            System.out.print(prompt);//打印提示信息
            String str = buf.readLine();
            if (str.matches("\\d+")) {
                flag = false;
                num = Integer.parseInt(str);
            } else {
                System.out.println("输入的内容不是数字.");
            }
        }
        return  num;
    }
}
