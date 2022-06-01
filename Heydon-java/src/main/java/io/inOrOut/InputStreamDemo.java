package io.inOrOut;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author haiDong
 * @Date: 2021/7/5 12:08 上午
 * @Description: InputStream 字节输入流
 */
public class InputStreamDemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/haidong/Downloads/javaCode/suhaidong/Heydon-java" +
                File.separator + "IoDemo/OutputStream.txt");
        if (!file.exists()) {
            System.out.println("文件不存在");
        }
        InputStream input = new FileInputStream(file);
        // 开辟缓冲区读取数据
        byte[] data = new byte[1024];
        int len = input.read(data);
        System.out.println("【" + new String(data, 0, len) + "】");
        input.close();
    }
}
