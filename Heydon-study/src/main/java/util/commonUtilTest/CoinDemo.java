package util.commonUtilTest;

import lombok.Getter;

import java.util.Random;

/**
 * @Author haiDong
 * @Date: 2021/6/20 10:27 下午
 * @Description: 模拟扔硬币，输出正面和反面的次数
 */
public class CoinDemo {
    public static void main(String[] args) {
        Coin c = new Coin();
        c.throwCoin(1000);
        System.out.println("正面：" + c.getFront() + "\n反面：" + c.getBack());
    }
}
class Coin{
    @Getter
    private int front;
    @Getter
    private int back;
    private Random random = new Random();
    public void throwCoin(int num){
        for (int x = 0; x < num; x++){
            int temp = random.nextInt(2);
            if (temp == 0){
                front++;
            }
            if (temp == 1){
                back++;
            }
        }
    }

}
