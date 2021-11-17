package fanshe.basic.daili;

/**
 * @Author 海东
 * @Date: 2021/10/18 11:38 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        IMessage msg = new MessageProxy(new MessageReal());
        msg.send();
    }
}
