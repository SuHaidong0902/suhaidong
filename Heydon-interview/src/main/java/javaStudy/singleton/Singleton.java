package javaStudy.singleton;

/**
 * @Author 海东
 * @Date: 2021/8/25 12:20 上午
 * @Description: 单例设计模式面试题：请编写单例设计模式 - 懒汉式
 * 本质：类内部构造方法私有化
 * 【100%】直接编写单例设计模式，并且实现构造方法私有化
 * 【120%】在java中哪里使用到单例设计模式了？Runtime类、Spring框架；
 * 【200%】懒汉式单利设计模式的问题？ 多线程时，调用不同步，详见下面
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton(){
        System.out.println("【" + Thread.currentThread().getName() + "】******实例化Singleton类对象*******");
    }
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("海东");
    }
}
