package io.ioTest.mian;

import io.ioTest.factory.Factory;
import io.ioTest.impl.INumberServiceImpl;
import io.ioTest.service.INumberService;

import java.io.File;

/**
 * @Author 海东
 * @Date: 2021/8/10 11:39 下午
 */
public class IoCaseDemo {
   /* private static final String SAVE_DIR = "/Users/suhaidong/Downloads/javaCode/suhaidong/Heydon-java"+
            File.separator + "IoDemo";
    static {
        File file = new File(SAVE_DIR);
        if (!file.exists()){
            file.mkdirs();
        }
    }*/

    public static void main(String[] args) {
        /**
         * @Description: 编写获取最大值、最小值 测试程序类
         */
        INumberService ins = new INumberServiceImpl();
        INumberService iNumberService = Factory.getInstance();
        int[] result = ins.stat(3);
        System.out.println("最大值:" + result[0] + "、最小值：" + result[1]);

        /**
         *
         */


    }
}
