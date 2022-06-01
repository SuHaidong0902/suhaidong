package fanshe.basic.factory;

/**
 * @Author 海东
 * @Date: 2021/8/24 11:01 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        IMessage msg = Factory.getInstance("fanshe.basic.factory.NetMessage", IMessage.class);
        IMessage cmg = Factory.getInstance("fanshe.basic.factory.CloudMessage", IMessage.class);
        msg.send();
        cmg.send();
        IService service = Factory.getInstance("fanshe.basic.factory.HouseService", IService.class);
        service.service();
    }
}
