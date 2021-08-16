package io.operate;

import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * @Author 海东
 * @Date: 2021/7/7 1:08 上午
 * @Description: 管道流，线程之间的IO操作
 */
public class PipedIODemo {
    @SneakyThrows
    public static void main(String[] args) {
        SendThread send = new SendThread();
        ReceiveThread receive = new ReceiveThread();
        send.getOutput().connect(receive.getInput()); // 进行管道链接
        new Thread(send, "消息发送线程：").start();
        new Thread(receive, "消息接收线程：").start();
    }
}

class SendThread implements Runnable {
    private PipedOutputStream output;  // 管道输出流

    public SendThread() {
        this.output = new PipedOutputStream(); // 实例化输出管道流
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int x = 0; x < 10; x++) {
            this.output.write(
                    ("【第" + (x + 1) + "次信息发送 -】" + Thread.currentThread().getName() + "：haidong").getBytes());
            this.output.close();
        }
    }

    public PipedOutputStream getOutput() {
        return output;
    }
}

class ReceiveThread implements Runnable {
    private PipedInputStream input;

    public ReceiveThread() {
        this.input = new PipedInputStream();
    }

    @SneakyThrows
    @Override
    public void run() {
        byte[] data = new byte[1024];
        int len = 0;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while ((len = this.input.read(data)) != -1) {
            bos.write(data, 0, len);
        }
        System.out.println("【接收】：" + new String(bos.toByteArray()));
        this.input.close();
    }

    public PipedInputStream getInput() {
        return input;
    }
}
