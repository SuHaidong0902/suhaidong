package util.commonUtilOperator;

/**
 * @Author haiDong
 * @Date: 2021/6/16 11:35 下午
 * @Description: 使用StringBuffer添加26个小写字母，倒序输出，删除前五个
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        char a = 'a';
        char z = 'z';
        for (int x = a; x <= z; x++){
            sb.append((char)x);
        }
        sb.reverse().delete(0,5);
        System.out.println(sb);
    }

}
