package io.operate;

import java.io.File;

/**
 * @Author haiDong
 * @Date: 2021/6/27 3:36 下午
 * @Description: 递归遍历文件，实现重命名为txt结尾
 */
public class RenameFile {
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-study" +
                File.separator + "IoDemo");
        renameFile(file);

    }

    public static void renameFile(File file) {
        if (file.isDirectory()) {
            File[] result = file.listFiles();
            if (result != null) {
                for (int i = 0; i < result.length; i++) {
                    renameFile(result[i]);
                    System.out.println(result[i]);
                }
            }
        }
        if (file.isFile()) {
            String fileName = null;
            if (file.getName().contains(".")) {
                fileName = file.getName().substring(0, file.getName().lastIndexOf(".")) + ".txt";
                System.out.println(fileName + "-----");
            } else {
                fileName = file.getName() + ".txt";
            }
            File newFile = new File(file.getParentFile(), fileName);
            file.renameTo(newFile);
        }
    }
}

