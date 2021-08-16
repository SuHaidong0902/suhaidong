package io.operate;

import lombok.SneakyThrows;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @Author 海东
 * @Date: 2021/7/7 11:37 下午
 * @Description: 随机读取数据
 */
public class RanddomAccessFileDemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java"+
                File.separator + "IoDemo/RandomAccessFileDemo.txt");
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        String[] names = new String[]{"zhangsan","lisi    ","wangwu  "};
        int[] ages = new int[]{30,20,16};
        for (int x = 0; x < names.length; x++){
            raf.write(names[x].getBytes());
            raf.writeInt(ages[x]);
        }
        raf.close();
    }
}
