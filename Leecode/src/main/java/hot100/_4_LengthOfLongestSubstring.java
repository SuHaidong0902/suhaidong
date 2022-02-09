package hot100;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @Author 海东
 * @Date: 2022/2/9 10:46 下午
 * @Description: 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class _4_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len == 0){
            throw new NullPointerException("输入为空....");
        }
        HashMap<Character, Integer> map = new HashMap<>(s.length());
        int max = 0;
        int left = 0;
        for(int i = 0; i < len; i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;

    }

    public static void main(String[] args) {
        _4_LengthOfLongestSubstring lols = new _4_LengthOfLongestSubstring();
        System.out.println(lols.lengthOfLongestSubstring("abcabcbb"));
    }
}
