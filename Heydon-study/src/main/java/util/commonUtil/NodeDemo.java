package util.commonUtil;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/21
 * @Description: 链表
 */

interface ILink<E> {
    // 新增节点
    void add(E e);
    // 获取长度
    int size(E e);
    // 空集合判断
    boolean isEmpty(E e);
    // 返回集合数据
    Object[] toArray(E e);

}

class ILinkImpl<E> implements ILink<E> {
    private Node root;
    private int count;
    private int food;
    private Object[] returnData;

    private class Node {
        private E data;
        private Node next;

        public Node(E data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }
    }

    @Override
    public void add(E e) {
        if (e == null) {
            return;
        }
        //数据本身不具有关联特性，只有Node类有，必须要关联到Node里
        Node newNode = new Node(e);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.next.addNode(newNode);
        }
        this.count++;
    }

    @Override
    public int size(E e) {
        return this.count;
    }

    @Override
    public boolean isEmpty(E e) {
        return this.count == 0;
    }

    @Override
    public Object[] toArray(E e) {
        return new Object[0];
    }
}

public class NodeDemo {
    public static void main(String[] args) {
        ILink<String> all = new ILinkImpl<>();
        all.add("aa");
        all.add("bb");
        all.add("cc");

    }

}
