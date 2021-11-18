package fanshe.basic.annotation.factory;

/**
 * @Author 海东
 * @Date: 2021/11/18 11:00 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        /*IMessage msg = Factory.getInstance(MessageImpl.class);
        msg.send("haidong");*/
        MessageService ms = new MessageService();
        ms.send("haidong");
    }
}
