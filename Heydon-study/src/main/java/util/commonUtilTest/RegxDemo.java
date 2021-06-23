package util.commonUtilTest;

/**
 * @Author haiDong
 * @Date: 2021/6/20 10:07 下午
 * @Description: 输入email地址，用正则验证输入是否正确
 */
public class RegxDemo {

    public static void main(String[] args) {
        /*if (args.length != 1){
            System.out.println("程序执行错误，请输入参数");
            System.exit(1);
        }
        String email = args[0];*/
        String email = "839@qq.com";
        if (Validator.isEmail(email)){
            System.out.println("输入email正确");
        }else {
            System.out.println("输入email错误");
        }

    }
}
class Validator{
    private Validator(){ }
    public static boolean isEmail(String email){
        if (email == null || "".equals(email)){
            return false;
        }
        String regx = "\\w+@\\w+\\.\\w+";
        return email.matches(regx);
    }
}
