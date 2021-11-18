package fanshe.basic.annotation.factory;

import lombok.SneakyThrows;

/**
 * @Author 海东
 * @Date: 2021/11/18 10:54 下午
 * @Description:
 */
public class Factory {
    private Factory(){}
    @SneakyThrows
    public static <T> T getInstance(Class<T> clazz){ // 直接返回实例化的操作对象
        return (T)new MessageProxy().bind(clazz.getDeclaredConstructor().newInstance());

    }
}
