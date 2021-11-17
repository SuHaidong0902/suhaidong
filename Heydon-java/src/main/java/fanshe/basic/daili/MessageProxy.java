package fanshe.basic.daili;

/**
 * @Author 海东
 * @Date: 2021/10/18 11:33 下午
 * @Description: 代理类
 */
public class MessageProxy implements IMessage {
    private IMessage message; // 代理对象，一定是业务接口实例

    public MessageProxy(IMessage message) {
        this.message = message;
    }

    public boolean connect() {
        System.out.println("【消息代理】。。。进行消息发送的链接");
        return true;
    }

    public void close() {
        System.out.println("【消息代理】。。。关闭消息通道");
    }

    @Override
    public void send() {
        if (this.connect()){
            this.message.send();
            this.close();
        }
    }
}
