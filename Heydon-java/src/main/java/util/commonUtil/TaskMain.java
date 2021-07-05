package util.commonUtil;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: TODO
 */
class MyTask extends TimerTask{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "、定时任务，当前时间：" + System.currentTimeMillis());
    }
}
public class TaskMain {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTask(),100,1000);
        // timer.schedule(new MyTask(),1000);
    }
}
