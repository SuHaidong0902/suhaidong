package fanshe.basic.daili;

/**
 * @Author 海东
 * @Date: 2021/10/18 11:31 下午
 * @Description:
 */
public class MessageReal implements IMessage{
    @Override
    public void send() {
        System.out.println("【发送消息。。。。】");
    }
}
