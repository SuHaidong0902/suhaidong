package thread;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: 多线程练习，多线程引用传递
 */
public class JavaThreadDemo {
    public static void main(String[] args) {
        new Thread(() -> {
            Message msg = new Message();
            msg.setInfo("消息1");
            Channel c = new Channel();
            c.setMessage(msg);
            c.sendMessage();
        }, "ThreadA、").start();
        new Thread(() -> {
            Message msg = new Message();
            msg.setInfo("消息2");
            Channel c = new Channel();
            c.setMessage(msg);
            c.sendMessage();
        }, "ThreadB、").start();
        new Thread(() -> {
            Message msg = new Message();
            msg.setInfo("消息3");
            Channel c = new Channel();
            c.setMessage(msg);
            c.sendMessage();
        }, "ThreadC、").start();

    }
}

class Channel {
    private static final ThreadLocal<Message> THREAD_LOCAL = new ThreadLocal<Message>();
    public void setMessage(Message m) {
        THREAD_LOCAL.set(m);
    }
    public void sendMessage() {
        System.out.println(Thread.currentThread().getName() + "【消息发送】： " + THREAD_LOCAL.get().getInfo());
    }
}

class Message {
    private String info;

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return this.info;
    }

}
