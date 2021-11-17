package fanshe.basic.annotation;

import lombok.SneakyThrows;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @Author 海东
 * @Date: 2021/11/17 10:49 下午
 * @Description: 自定义Annotation
 */

@Retention(RetentionPolicy.RUNTIME) // 定义运行时策略
@interface DefaultAnnotation{
    String title();
    String url() default "www.baidu.com";

}
class Message{
    @DefaultAnnotation(title="haidong",url = "www.hao123.com")
    public void send(String msg){
        System.out.println("【消息发送】：" + msg);
    }
}
public class DefaultAnnotationDemo {
    @SneakyThrows
    public static void main(String[] args) {
        Method method = Message.class.getMethod("send", String.class);
        DefaultAnnotation anno = method.getAnnotation(DefaultAnnotation.class); // 获取指定的Annotation
        System.out.println(anno.title());
        System.out.println(anno.url());

        String msg = anno.title() + '\t' + anno.url();
        method.invoke(Message.class.getDeclaredConstructor().newInstance(),msg);


    }
}
