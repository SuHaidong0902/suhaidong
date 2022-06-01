package fanshe.basic.simpleClass;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author 海东
 * @Date: 2021/9/15 10:00 下午
 * @Description: 进行bean处理的类，实现属性的设置
 */
public class BeanUtils {
    private BeanUtils() {
    }

    /**
     * 实现指定对象的属性设置
     *
     * @param obj
     * @param value
     */
    @SneakyThrows
    public static void setValue(Object obj, String value) {
        String[] results = value.split("\\|");
        for (int x = 0; x < results.length; x++) {
            String[] attVal = results[x].split(":");
            if (attVal[0].contains(".")) { //多级配置
                String[] temp = attVal[0].split("\\.");
                Object currentObject = obj;
                // System.out.println(Arrays.toString(temp));
                // 最后一位是属性名称，不在本次实例化范围内
                for (int y = 0; y < temp.length - 1; y++) {
                    // 调用getter方法，如果getter返回空，表示对象未实例化
                    Method getMethod = currentObject.getClass().getDeclaredMethod(
                            "get" + StringUtils.initCap(temp[y]));
                    Object tempObject = getMethod.invoke(currentObject);

                    if (tempObject == null) { //该对象现在并没有实例化
                        Field field = currentObject.getClass().getDeclaredField(temp[y]); // 获取属性类型
                        Method method = currentObject.getClass().getDeclaredMethod(
                                "set" + StringUtils.initCap(temp[y]), field.getType());
                        Object newObject = field.getType().getDeclaredConstructor().newInstance();
                        method.invoke(currentObject, newObject);
                        currentObject = newObject;
                    } else {
                        currentObject = tempObject;
                    }
                    // System.out.println(temp[y] + "-----" + currentObject);
                }
                // 进行属性内容设置
                Field field = currentObject.getClass().getDeclaredField(temp[temp.length - 1]);
                System.out.println("&&&&&&&&&&&&&&&&&&&" + field);
                Method setMethod = currentObject.getClass().getDeclaredMethod(
                        "set" + StringUtils.initCap(temp[temp.length - 1]), field.getType());
                Object convertValue = BeanUtils.convertAttributeValue(
                        field.getType().getName(), attVal[1]);
                setMethod.invoke(currentObject, convertValue); // 调用setter方法设置内容

            } else {
                Field field = obj.getClass().getDeclaredField(attVal[0]);//获取成员
                // System.out.println("----------" + field +"--------");
                Method setMethod = obj.getClass().getDeclaredMethod(
                        "set" + StringUtils.initCap(attVal[0]), field.getType());
                // System.out.println("*********" + setMethod +"***********");
                Object convertValue = BeanUtils.convertAttributeValue(
                        field.getType().getName(), attVal[1]);
                // System.out.println("######" + convertValue +"######");
                setMethod.invoke(obj, convertValue); // 调用setter方法设置内容
            }
        }
    }

    /**
     * 实现属性类型转换处理
     *
     * @param type  属性类型，通过filed获取
     * @param value 属性内容。传入字符串，需要将其变成指定类型
     * @return 转换后的数据
     */
    @SneakyThrows
    private static Object convertAttributeValue(String type, String value) {
        // System.out.println("type = " + type + "、\tvalue = " + value);
        if ("long".equals(type) || "java.long.Long".equals(type)) {
            return Long.parseLong(value);
        } else if ("int".equals(type) || "java.long.int".equals(type)) {
            return Integer.parseInt(value);
        } else if ("double".equals(type) || "java.long.double".equals(type)) {
            return Double.parseDouble(value);
        } else if ("java.util.Date".equals(type)) {
            SimpleDateFormat sdf = null;
            if (value.matches("\\d{4}-\\d{2}=\\d{2}")) {
                sdf = new SimpleDateFormat("yyyy-MM-dd");
            } else if (value.matches("\\d{4}-\\d{2}=\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
                sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            } else {
                return new Date();
            }
            return sdf.parse(value);
        } else {
            return value;
        }
    }
}
