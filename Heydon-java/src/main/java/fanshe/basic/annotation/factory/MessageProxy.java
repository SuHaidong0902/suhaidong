package fanshe.basic.annotation.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 海东
 * @Date: 2021/11/18 10:45 下午
 * @Description:
 */
public class MessageProxy implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public boolean connect() {
        System.out.println("【代理操作】进行消息发送通道的链接");
        return true;
    }

    public void close() {
        System.out.println("【代理操作】关闭消息发送通道链接~~");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (this.connect()) {
                return method.invoke(this.target, args);
            } else {
                throw new Exception("[ERR]消息发送失败");
            }
        } finally {
            this.close();
        }
    }
}
