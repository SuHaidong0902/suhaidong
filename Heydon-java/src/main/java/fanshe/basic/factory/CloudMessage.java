package fanshe.basic.factory;

/**
 * @Author 海东
 * @Date: 2021/8/24 11:10 下午
 * @Description:
 */
public class CloudMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("【云端消息发送】年薪百万！");
    }
}
