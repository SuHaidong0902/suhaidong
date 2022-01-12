package leiji.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Author 海东
 * @Date: 2022/1/12 10:35 下午
 * @Description:
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"java","python","C","C++","JavaScript","jsp","json");
        Stream<String> stream = all.stream(); //获得Stream接口对象
       // System.out.println(stream.count()); //输出元素的个数

        // 要求将每个元素的字母变为小写字母，并且判断每个元素是否存在
        /*Stream<String> result = stream.filter((ele) ->
                ele.toUpperCase().contains("C"));
        long count = result.count();
        System.out.println(count);*/

        // 数据采集：将满足条件的数据搜集起来，转为List集合
        /*List<String> result = stream.filter((ele) ->
                ele.toUpperCase().contains("C")).collect(Collectors.toList());
        System.out.println(result);*/

        // 数据分页
        Stream<String> result = stream.filter((ele) ->
                ele.toLowerCase().contains("j")).skip(1).limit(5);
        List<String> resultList = result.collect(Collectors.toList());
        System.out.println(resultList);




    }
}
