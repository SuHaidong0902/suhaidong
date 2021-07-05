package io.operate;

import java.io.File;

/**
 * @Author haiDong
 * @Date: 2021/6/27 3:07 下午
 * @Description: 列出指定目录下的所有文件
 */
public class ListDir {
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-study"+
               File.separator + "IoDemo");
       // File file = new File("/Users/suhaidong");
        listDir(file);
    }

    public static void listDir(File file) {
        if (file.isDirectory()) {
            File[] result = file.listFiles();
            if (result != null) {
                for (int x = 0; x < result.length; x++) {
                    // System.out.println(result[x]);
                    listDir(result[x]);
                }
            }
        }
        System.out.println(file);

    }
}