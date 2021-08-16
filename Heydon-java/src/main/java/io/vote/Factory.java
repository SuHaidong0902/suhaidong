package io.vote;

/**
 * @Author 海东
 * @Date: 2021/8/17 11:47 下午
 * @Description:
 */
public class Factory {
    private Factory(){}
    public static IVoteService getInstance(){
        return new VoteServiceImpl();
    }
}
