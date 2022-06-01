package io.inOrOut;

import java.io.*;

/**
 * @Author haiDong
 * @Date: 2021/6/30 1:50 下午
 * @Description: OutputStream 字节输出流
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java" +
                File.separator + "IoDemo/OutputStream.txt");  // 1. 指定操作的文件路径
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        OutputStream output = new FileOutputStream(file, true);       // 2. 通过子类实例化
        String str = "suhaidong123\r\n";    //  要输出的内容
        output.write(str.getBytes());   // 3. 将字符串变为字节数组输出
        output.close();

       /* try(FileOutputStream output = new FileOutputStream(file)){
            String str = "suhaidong123";    //  要输出的内容
            output.write(str.getBytes());
        }catch (IOException e ){
            e.printStackTrace();
        }*/
    }

}
