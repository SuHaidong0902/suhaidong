package javaStudy.singleton;

/**
 * @Author 海东
 * @Date: 2021/8/25 9:51 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            new Thread(() -> {
                Singleton.getInstance().print();
            }, "单例消费端" + x).start();
        }
    }
}
