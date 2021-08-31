package fanshe.basic.simpleClass;

/**
 * @Author 海东
 * @Date: 2021/9/2 11:38 下午
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        String value = "ename:Smith|job:Clerk";
        Emp emp = ClassInstanceFactory.create(Emp.class,value);
        System.out.println("姓名：" + emp.getEName() + "、性别：" + emp.getJob());

        /*Emp emp = new Emp();
        emp.setEName("123");
        emp.setJob("测试");
        System.out.println("姓名：" + emp.getEName() + "、性别：" + emp.getJob());*/
    }
}
