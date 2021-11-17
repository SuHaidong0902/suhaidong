package io.inOrOut;

import lombok.SneakyThrows;

import java.io.*;

/**
 * @Author 海东
 * @Date: 2021/7/5 10:42 下午
 * @Description: 字符输出流,优势在于中文数据
 */
public class WriterDemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java"+
                File.separator + "IoDemo/OutputStream.txt");
        if (!file.getParentFile().exists()){
            file.mkdirs();
        }
        Writer out = new FileWriter(file,true);
        String str = "io writer -----   hhh\r\n";
        out.write(str);
        out.append("学习~~~");
        out.close();
    }
}
