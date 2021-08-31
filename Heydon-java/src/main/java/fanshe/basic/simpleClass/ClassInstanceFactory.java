package fanshe.basic.simpleClass;

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


        return null;
    }

}
