package fanshe.basic.simpleClass;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

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
            // System.out.println("----------" + field +"--------");
            Method setMethod = obj.getClass().getDeclaredMethod(
                    "set" + StringUtils.initCap(attVal[0]),field.getType());
            // System.out.println("*********" + setMethod +"***********");
            Object convertValue = BeanUtils.convertAttributeValue(field.getType().getName(), attVal[1] );
            setMethod.invoke(obj,convertValue); // 调用setter方法设置内容
        }
    }

    /**
     * 实现属性类型转换处理
     * @param type 属性类型，通过filed获取
     * @param value 属性内容。传入字符串，需要将其变成指定类型
     * @return 转换后的数据
     */
    @SneakyThrows
    private static Object convertAttributeValue(String type, String value){
        // System.out.println("type = " + type + "、\tvalue = " + value);
        if ("long".equals(type) || "java.long.Long".equals(type)){
            return Long.parseLong(value);
        }else if("int".equals(type) || "java.long.int".equals(type)){
            return Integer.parseInt(value);
        }else if("double".equals(type) || "java.long.double".equals(type)){
            return Double.parseDouble(value);
        }else if("java.util.Date".equals(type)){
            SimpleDateFormat sdf = null;
            if (value.matches("\\d{4}-\\d{2}=\\d{2}")){
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            }else if (value.matches("\\d{4}-\\d{2}=\\d{2} \\d{2}:\\d{2}:\\d{2}")){
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else{
                return new Date();
            }
            return sdf.parse(value);
        }else{
            return value;
        }
    }
}
