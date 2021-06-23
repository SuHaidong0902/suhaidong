import java.util.Arrays;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/20
 * @Description: TODO
 */
public class test {
    public static void main(String[] args) {
        String a = "192.168.1.1";
        String [] num = a.split("\\.");

        for (String x : num){
            System.out.println(x);
        }

    }
}
