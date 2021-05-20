package util;

import java.util.Base64;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: 复杂加密
 */

class Complicated {
    private static final String SALT = "suhaidong";
    private static final int REPEAT = 5;

    /**
     * 加密处理
     *
     * @param str 需要加密的字符串，需要与盐值整合
     * @return 加密后的结果
     */
    public static String encode(String str) {
        String temp = str + "{" + SALT + "}";
        byte[] data = temp.getBytes();
        for (int i = 0; i < REPEAT; i++) {
            data = Base64.getEncoder().encode(data);
        }
        return new String(data);
    }

    /**
     * 解密粗粒
     *
     * @param str 要解密的内容
     * @return 解密后的原始字符串
     */
    public static String decode(String str) {
        byte[] data = str.getBytes();
        for (int i = 0; i < REPEAT; i++) {
            data = Base64.getDecoder().decode(data);
        }
        return new String(data).replaceAll("\\{\\w+\\}", "");
    }
}

public class Base64Complicated {
    public static void main(String[] args) {
        String encStr = Complicated.encode("love");
        System.out.println("加密后的结果:" + encStr);
        String decStr = Complicated.decode(encStr);
        System.out.println("解密后的结果：" + decStr);

    }
}
