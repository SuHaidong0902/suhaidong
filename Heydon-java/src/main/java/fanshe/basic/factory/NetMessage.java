package fanshe.basic.factory;

/**
 * @Author 海东
 * @Date: 2021/8/24 11:00 下午
 * @Description:
 */
public class NetMessage implements IMessage {
    @Override
    public void send() {
        System.out.println("【网络消息发送】海东");
    }
}
