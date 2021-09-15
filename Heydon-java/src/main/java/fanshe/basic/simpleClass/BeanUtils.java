package fanshe.basic.simpleClass;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author 海东
 * @Date: 2021/9/15 10:00 下午
 * @Description: 进行bean处理的类，实现属性的设置
 */
public class BeanUtils {
    private BeanUtils(){}

    /**
     * 实现指定对象的属性设置
     * @param obj
     * @param value
     */
    @SneakyThrows
    public static void setValue(Object obj, String value){
        String[] results = value.split("\\|");
        for (int x = 0; x < results.length; x++){
            String[] attVal = results[x].split(":");
            Field field = obj.getClass().getDeclaredField(attVal[0]);//获取成员
            System.out.println("----------" + field +"--------");
            Method setMethod = obj.getClass().getDeclaredMethod(
                    "set" + StringUtils.initCap(attVal[0]),field.getType());
            System.out.println("*********" + setMethod +"***********");
            setMethod.invoke(obj,attVal[1]); // 调用setter方法设置内容
        }
    }
}
