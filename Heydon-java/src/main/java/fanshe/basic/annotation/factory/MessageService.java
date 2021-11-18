package fanshe.basic.annotation.factory;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Author 海东
 * @Date: 2021/11/18 11:06 下午
 * @Description:
 */

@Retention(RetentionPolicy.RUNTIME)
@interface UseMessage{
    public Class<?> clazz();
}
@UseMessage(clazz = NetMessageImpl.class) // 利用Annotation实现了类的使用
public class MessageService {
    private IMessage message;
    public MessageService(){
        UseMessage use = MessageService.class.getAnnotation(UseMessage.class);
        this.message = (IMessage) Factory.getInstance(use.clazz());
    }
    public void send(String msg){
        this.message.send(msg);
    }
}
