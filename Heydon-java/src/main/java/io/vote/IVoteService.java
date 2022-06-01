package io.vote;

/**
 * @Author 海东
 * @Date: 2021/8/17 11:37 下午
 * @Description:
 */
public interface IVoteService {
    // 根据编号排序
    boolean inc(long sid);

    // 获取投票结果
    Student[] result();

    // 获取全部数据
    Student[] getData();
}
