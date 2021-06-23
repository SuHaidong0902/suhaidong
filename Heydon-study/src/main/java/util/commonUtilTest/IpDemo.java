package util.commonUtilTest;

/**
 * @Author haiDong
 * @Date: 2021/6/20 10:36 下午
 * @Description: 编写正则，判断给定组合是一个合法ip
 */
public class IpDemo {
    public static void main(String[] args) {
        String ip = "192.168.1.299";
        System.out.println(ValidatorIp.isIp(ip));
    }
}

class ValidatorIp {
    public static boolean isIp(String ip) {
        if (ip == null || "".equals(ip)) {
            return false;
        }
        String regx = "([12]?[0-9]?[0-9]\\.){3}[12]?[0-9]?[0-9]";
        if (ip.matches(regx)) {
            String[] result = ip.split("\\.");
            for (int i = 0; i < result.length; i++) {
                int num = Integer.parseInt(result[i]);
                System.out.println(num);
                if (num > 255) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

}
