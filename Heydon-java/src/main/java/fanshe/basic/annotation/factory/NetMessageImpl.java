package fanshe.basic.annotation.factory;

/**
 * @Author 海东
 * @Date: 2021/11/18 10:44 下午
 * @Description:
 */
public class NetMessageImpl implements IMessage {
    @Override
    public void send(String msg) {
        System.out.println("【消息发送】..." + msg);
    }
}
