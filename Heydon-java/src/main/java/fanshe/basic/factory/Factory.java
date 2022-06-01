package fanshe.basic.factory;

import lombok.SneakyThrows;

/**
 * @Author 海东
 * @Date: 2021/8/24 11:03 下午
 * @Description: 利用工厂设计模式解决耦合问题；解决一个接口的每个方法都需要实例化问题
 */
public class Factory {
    private Factory() {
    } // 没有产生实例化对象的意义，所以构造方法私有化

    @SneakyThrows
    /**
     * 获取接口实例化对象
     * @param className 接口子类
     * @param clazz ，描述的是一个接口的类型
     * @return 如果接口存在，则返回指定接口实例化对象
     */
    public static <T> T getInstance(String className, Class<T> clazz) {
        T instance = null;
        instance = (T) Class.forName(className).getDeclaredConstructor().newInstance();
        return instance;
    }
}
