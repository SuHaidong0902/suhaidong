package io.inOrOut;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * @Author 海东
 * @Date: 2021/7/5 10:42 下午
 * @Description: 字符输入流
 */
public class ReaderDemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java" +
                File.separator + "IoDemo/OutputStream.txt");
        if (!file.exists()) {
            System.out.println("file can not exists.");
        }
        Reader in = new FileReader(file);
        char[] data = new char[1024];
        int len = in.read(data);
        System.out.println("【读取内容【" + new String(data, 0, len) + "】");
        in.close();


    }
}
