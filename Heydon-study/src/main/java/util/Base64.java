package util;

import static java.util.Base64.*;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: 简单加密
 */
public class Base64 {
    public static void main(String[] args) {
        String str = "suhaidong";
        String encStr = new String(java.util.Base64.getEncoder().encode(str.getBytes()));
        System.out.println(encStr);
        String decStr = new String(java.util.Base64.getDecoder().decode(encStr));
        System.out.println(decStr);
    }
}
