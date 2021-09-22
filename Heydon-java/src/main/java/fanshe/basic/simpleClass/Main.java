package fanshe.basic.simpleClass;

/**
 * @Author 海东
 * @Date: 2021/9/2 11:38 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        String value = "ename:Smith|job:Clerk|salary:123.4|empno:5678|hiredate:2021-09-10";
        Emp emp = ClassInstanceFactory.create(Emp.class,value);
        System.out.println("姓名：" + emp.getEname() + "、\n职业：" + emp.getJob()
        + "、\n收入：" + emp.getSalary() + "、\n编号：" + emp.getEmpno() + "、\n入职时间：" + emp.getHiredate());

        /*Emp emp = new Emp();
        emp.setEName("123");
        emp.setJob("测试");
        System.out.println("姓名：" + emp.getEName() + "、性别：" + emp.getJob());*/
    }
}
