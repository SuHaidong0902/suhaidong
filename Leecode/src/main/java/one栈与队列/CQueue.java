package one栈与队列;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @Author 海东
 * @Date: 2022/2/7 10:07 下午
 * @Description: 利用两个栈实现队列
 *
 *  * Your CQueue object will be instantiated and called as such:
 *  * CQueue obj = new CQueue();
 *  * obj.appendTail(value);
 *  * int param_2 = obj.deleteHead();
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else{
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
