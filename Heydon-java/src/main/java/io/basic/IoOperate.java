package io.basic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 * @Author haiDong
 * @Date: 2021/6/24 12:02 上午
 * @Description: 文件基本操作, 文件本身，不涉及内容处理
 */
public class IoOperate {
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-study/IoDemo" +
                File.separator + "test.zip");
        if (file.exists()) {
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(MathUtil.round(file.length() / (double) 1024 / 1024, 2) + " M");
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file.lastModified()));
            System.out.println(file.isDirectory());
            System.out.println(file.isFile());
            System.out.println(file.getParentFile() + "-----");
            File file2 = new File(file.getParentFile(),"123");
            System.out.println(file2+"12345");
        }
        // 列出目录下全部内容
        File file2 = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-study");
        if (file2.isDirectory() && file2.listFiles() != null){
            for (int x = 0; x < Objects.requireNonNull(file2.listFiles()).length; x++){
                System.out.println(Objects.requireNonNull(file2.listFiles())[x]);
            }
        }
    }
}

class MathUtil {

    public static double round(double num, int scale) {
        return Math.round(Math.pow(10, scale) * num) / Math.pow(10, scale);
    }
}
