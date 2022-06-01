package io.ioTest.impl;

import io.ioTest.service.INumberService;
import io.ioTest.utils.InputUtil;

/**
 * @Author 海东
 * @Date: 2021/8/10 11:43 下午
 * @Description:
 */
public class INumberServiceImpl implements INumberService {
    @Override
    public int[] stat(int count) {
        int[] result = new int[2];
        int[] data = new int[count];
        for (int i = 0; i < data.length; i++) {
            data[i] = InputUtil.getInt("请输入第" + (i + 1) + "个数据:");
        }
        result[0] = data[0];
        result[1] = data[0];
        for (int m = 0; m < data.length; m++) {
            if (result[0] < data[m]) {
                result[0] = data[m];
            }
            if (result[1] > data[m]) {
                result[1] = data[m];
            }
        }
        return result;
    }
}
