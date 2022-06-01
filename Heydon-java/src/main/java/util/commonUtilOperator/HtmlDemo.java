package util.commonUtilOperator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author haiDong
 * @Date: 2021/6/20 11:04 下午
 * @Description: html解析
 */
public class HtmlDemo {
    public static void main(String[] args) {
        String str = "<font face=\"Arial,Serif\" size=\"2\" color=\"red\">";
        String regx = "\\w+=\"[a-zA-Z0-9,\\+]+\"";
        Matcher matcher = Pattern.compile(regx).matcher(str);
        while (matcher.find()) {
            String temp = matcher.group(0);
            String[] result = temp.split("=");
            System.out.println(result[0] + "   " + result[1].replaceAll("\"", ""));
        }
    }
}
