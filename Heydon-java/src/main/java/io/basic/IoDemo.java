package io.basic;

import lombok.SneakyThrows;

import java.io.File;

/**
 * @Author haiDong
 * @Date: 2021/6/23 12:20 上午
 * @Description: 判断文件是否存在，存在则删除，不存在则创建
 */
public class IoDemo {
    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-study"+
                File.separator + "test/海东测试file.txt");
        if (!file.getParentFile().exists()){
            file.mkdirs();
        }
        if (file.exists()){
            file.delete();
            System.out.println("文件删除成功~");
        }else{
            file.createNewFile();
            System.out.println("文件创建成功~");
        }
    }

}
