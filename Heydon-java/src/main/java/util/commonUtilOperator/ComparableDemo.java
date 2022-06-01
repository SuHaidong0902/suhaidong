package util.commonUtilOperator;

import lombok.Data;


import java.util.Arrays;


/**
 * @Author haiDong
 * @Date: 2021/6/21 11:03 下午
 * @Description: 按照"姓名：年龄：成绩|姓名：年龄：成绩"的格式定义字符串，每组值分别保存在Student中，并对这些对象进行排序；
 * 排序原则：成绩由高到低，如果成绩相同，按照年龄由低到高排序
 */
public class ComparableDemo {
    public static void main(String[] args) {
        String str = "张三:21:98|李四:24:99|王五:23:99";
        String[] result = str.split("\\|");
        Student[] stu = new Student[result.length];
        for (int i = 0; i < result.length; i++) {
            String[] temp = result[i].split(":");
            stu[i] = new Student(temp[0], Integer.parseInt(temp[1]), Double.parseDouble(temp[2]));
        }
        Arrays.sort(stu);
        System.out.println(Arrays.toString(stu));
    }
}

@Data
class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "【学生信息】姓名：" + this.name + "、年龄：" + this.age + "、成绩：" + this.score + "\n";
    }

    @Override
    public int compareTo(Student stu) {
        if (this.score < stu.score) {
            return 1;
        }
        if (this.score > stu.score) {
            return -1;
        }
        return this.age - stu.age;
    }

}
