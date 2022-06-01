package fanshe.basic.annotation;

import lombok.SneakyThrows;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author 海东
 * @Date: 2021/11/17 10:23 下午
 * @Description:
 */
@FunctionalInterface
@Deprecated()
interface IMessage {
    void send(String msg);
}

@SuppressWarnings("serial") // 无法在程序执行的时候获取
class MessageImpl implements IMessage, Serializable {
    @Override
    public void send(String msg) {
        System.out.println("【消息发送】XXX" + msg);
    }
}

public class AnnotationDemo {
    @SneakyThrows
    public static void main(String[] args) {
        {
            // 获取接口上的Annotation信息
            Annotation annotations[] = IMessage.class.getAnnotations();
            for (Annotation temp : annotations) {
                System.out.println(temp);
            }
        }
        System.out.println("--------------------");
        {
            // 获取子类上的Annotation信息，无法在程序执行的时候获取
            Annotation annotations[] = MessageImpl.class.getAnnotations();
            for (Annotation temp : annotations) {
                System.out.println(temp);
            }
        }
        System.out.println("--------------------");
        {
            // 获取子MessageImpl方法上的Annotation信息，无法在程序执行的时候获取
            Method method = MessageImpl.class.getDeclaredMethod("send", String.class);
            Annotation annotations[] = method.getAnnotations();
            for (Annotation temp : annotations) {
                System.out.println(temp);
            }
        }

    }
}
