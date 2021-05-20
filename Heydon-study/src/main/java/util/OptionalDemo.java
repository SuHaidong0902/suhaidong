package util;

import java.util.Optional;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: TODO
 */
interface IMessage{
    String getContent();
}
class IMessageImpl implements IMessage{
    @Override
    public String getContent() {
        return "suhaidong";
    }
}
class MessageUtil{
    public static Optional<IMessage> getMessage(){
        return Optional.ofNullable(null); // 有对象
    }
    public static void useMessage(IMessage msg){
            System.out.println(msg.getContent());
    }
}
public class OptionalDemo {
    public static void main(String[] args) {
        MessageUtil.useMessage(MessageUtil.getMessage().orElse(new IMessageImpl()));

    }
}
