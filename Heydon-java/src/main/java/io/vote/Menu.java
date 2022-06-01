package io.vote;

import io.ioTest.utils.InputUtil;

/**
 * @Author 海东
 * @Date: 2021/8/17 11:49 下午
 * @Description:
 */
public class Menu {
    private IVoteService voteService;

    public Menu() {
        this.voteService = Factory.getInstance();
        this.vote();
    }

    public void vote() {
        Student[] stu = this.voteService.getData();
        for (Student temp : stu) {
            System.out.println(temp.getSid() + ":" + temp.getName() + "【" + temp.getVote() + "】");
        }
        int num = 10;
        while (num != 0) {
            num = InputUtil.getInt("请输入数据(输入0代表结束)：");
            if (num != 0) {
                if (!this.voteService.inc(num)) {
                    System.out.println("此选票无效，请重新输入...");
                }
            }
        }
        System.out.println("投票最终结果：");
        stu = this.voteService.result();
        System.out.println(stu[0].getName() + "同学，以" + stu[0].getVote() + "票数，当选班长");
    }
}
