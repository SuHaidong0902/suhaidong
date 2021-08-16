package io.ioTest.factory;

import io.ioTest.impl.INumberServiceImpl;
import io.ioTest.service.INumberService;

/**
 * @Author 海东
 * @Date: 2021/8/10 11:50 下午
 * @Description:
 */
public class Factory {
    private static Object NumberServiceImpl;

    private Factory(){}
    public static INumberService getInstance(){
        return new INumberServiceImpl();
    }
}
