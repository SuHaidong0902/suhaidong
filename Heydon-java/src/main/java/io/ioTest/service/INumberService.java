package io.ioTest.service;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author 海东
 * @Date: 2021/8/10 11:41 下午
 * @Description:
 */
public interface INumberService {
    /**
     * 输入数据，返回数据的最大值与最小值
     * @param count 输入数据的个数
     * @return 0为最大值，1为最小值
     */
    int[] stat(int count);
}
