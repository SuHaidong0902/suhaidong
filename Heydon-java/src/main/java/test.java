import java.util.Arrays;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: TODO
 */
public class test {
    public static void main(String[] args) {
        /*String x = "124.abc.peg";
        System.out.println(x.lastIndexOf("."));
        System.out.println(x.substring(0,x.lastIndexOf(".")));


        int a = 3;
        int b = 4;
        if (a == 3 && b == 2){
            System.out.println("123");
        }*/

        int x = 4400;
        int count = 4400 * 5;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 6; i++){
            sb.append(count - x * i);
            sb.append(" -> ");
        }
        System.out.println(sb.delete(sb.lastIndexOf("-"),sb.length()));

    }
}
