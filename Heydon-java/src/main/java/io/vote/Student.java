package io.vote;

import lombok.Data;

/**
 * @Author 海东
 * @Date: 2021/8/17 11:27 下午
 * @Description:
 */
@Data
public class Student implements Comparable<Student> {
    private long sid;
    private String name;
    private int vote;

    public Student(long sid, String name, int vote) {
        this.sid = sid;
        this.name = name;
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "【" + this.sid + "】姓名：" + this.name + "、票数：" + this.vote;
    }

    @Override
    public int compareTo(Student stu) {
        return stu.vote - this.vote;
    }
}
