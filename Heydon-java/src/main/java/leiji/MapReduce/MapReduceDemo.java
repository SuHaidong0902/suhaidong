package leiji.MapReduce;

import lombok.Data;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @Author 海东
 * @Date: 2022/1/12 11:23 下午
 * @Description: mapReduce基础模型
 */

public class MapReduceDemo {
    public static void main(String[] args) {
        //如果要进行分析处理，需要将数据保存在stream集合之中,并且进行单价和数量的处理
        List<Order> all = new ArrayList<>();
        all.add(new Order("东哥1号",9.9,11));
        all.add(new Order("东哥2号",9987.1,2));
        all.add(new Order("东东1号",99,3));
        all.add(new Order("东哥3号",8.7,9));
        all.add(new Order("东哥4号",5.5,100));
        DoubleSummaryStatistics dss = all.stream().filter((ele) ->
                ele.getName().contains("东哥")).mapToDouble((orderObject) ->
                orderObject.getPrice() * orderObject.getAmount()).summaryStatistics();
        System.out.println("商品购买数量:" + dss.getCount());
        System.out.println("商品购买总价:" + dss.getSum());
        System.out.println("商品购买平均价:" + dss.getAverage());
        System.out.println("商品购买最低价:" + dss.getMin());
        System.out.println("商品购买最高价:" + dss.getMax());
    }
}

@Data
class Order{
    private String name;
    private double price;
    private int amount;

    public Order(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}