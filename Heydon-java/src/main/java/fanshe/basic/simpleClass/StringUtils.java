package fanshe.basic.simpleClass;

import java.util.Locale;

/**
 * @Author 海东
 * @Date: 2021/9/15 10:00 下午
 * @Description: 实现首字母大写
 */
public class StringUtils {
    public static String initCap(String str){
        if (str == null || "".equals(str)){
            return str;
        }
        if (str.length() == 1){
            return str.toUpperCase();
        }else{
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}
