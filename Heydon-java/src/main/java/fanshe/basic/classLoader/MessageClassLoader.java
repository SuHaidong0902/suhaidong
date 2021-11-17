package fanshe.basic.classLoader;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author 海东
 * @Date: 2021/10/8 10:58 下午
 * @Description: 自定义类加载器  作用：系统类加载器根据CLASSPATH路径加载的，自定义类加载器可以由开发者任意指派类加载的位置
 */
public class MessageClassLoader extends ClassLoader {
    private static final String MESSAGE_CLASS_PATH = "/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java"+
            File.separator + "IoDemo/Message.java";
    /**
     * 进行指定类的加载
     * @param className 类的完整名称 "包.类名称"
     * @return 返回一个指定类的Class对象
     * @throws Exception 如果类文件不存在，则无法加载
     */
    public Class<?> loadData(String className) throws Exception{

    return null;
    }

    private byte[] loadClassData() throws Exception{ // 通过文件进行类的加载
        InputStream input = null;
        ByteArrayInputStream bos = null; // 将数据加载到内存中
        byte[] data = null;
        try{
            input = new FileInputStream(new File(MESSAGE_CLASS_PATH)); // 文件流加载
            byte[] data2 = new byte[1024]; // 进行读取
            int len = input.read(data2);
            // data = bos.read(data2,0,len);

            //TODO 这里没搞定
           /* input.transferTo(bos);
            data = bos.toByteArray;*/


        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if (input != null){
                input.close();
            }
            if (bos != null){
                bos.close();
            }
        }
        return data;
    }
}
