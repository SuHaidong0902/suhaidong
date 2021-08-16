package io.operate;

import lombok.SneakyThrows;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @Author 海东
 * @Date: 2021/7/6 12:13 上午
 * @Description: 通过io内存流的方式，实现大小写转换
 */
public class IOUper {
    @SneakyThrows
    public static void main(String[] args) {
        String str = "suhaidong";
        InputStream input = new ByteArrayInputStream(str.getBytes());
        OutputStream output = new ByteArrayOutputStream();
        // ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        int data = 0;
        while ((data = input.read()) != -1){
            output.write(Character.toUpperCase((char)data));
            // byteOut.write(Character.toUpperCase(data));
        }
        // byte[] result = byteOut.toByteArray();
        // System.out.println("-----:" + new String(result));
        System.out.println(output);
        input.close();
        output.close();
        // byteOut.close();

    }
}
