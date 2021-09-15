package fanshe.basic.simpleClass;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author 海东
 * @Date: 2021/9/7 12:03 上午
 * @Description: 负责所有的反射处理，接收反射对象、设置的属性内容，获取指定类的实例化对象
 */
public class ClassInstanceFactory {
    private ClassInstanceFactory(){}

    /**
     * 实例化对象创建的方法，可以根据传入的字符串结构"属性：内容|属性：内容"
     * @param clazz 要进行反射的实例化对象
     * @param value 要设置给对象的属性内容
     * @param <T>
     * @return 已经配置好属性内容的java类对象
     */
    public static <T> T create(Class<?> clazz, String value){
        // 如果采用反射进行对象属性设置，类中必须有无参构造
        try {
            Object obj = clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(obj,value); // 通过反射，设置属性
            return (T) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
