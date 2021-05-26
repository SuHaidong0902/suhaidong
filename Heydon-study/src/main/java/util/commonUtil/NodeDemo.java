package util.commonUtil;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/21
 * @Description: 链表
 */

interface ILink<E> {
    // 增加链表数据
    void add(E e);

    //获取数据的个数
    int size();

    //判断是否空集合
    boolean isEmpty();

    //返回集合数据
    Object[] toArray();

    // 获取指定索引数据
    E get(int index);

    // 修改制定索引数据
    void set(int index, E data);

    // 判断指定数据是否存在
    boolean contains(E data);

    // 数据删除
    void remove(E data);

    // 清空链表
    void clean();


}

class ILinkImpl<E> implements ILink<E> {
    //保存根元素
    private Node root;
    //保存数据个数
    private int count;
    //操作数组的角标
    private int foot;
    // 保存返回的数组
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

        public void toArrayNode() {
            ILinkImpl.this.returnData[ILinkImpl.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        public E getNode(int index) {
            if (ILinkImpl.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        public void setNode(int index, E data) {
            if (ILinkImpl.this.foot++ == index) {
                this.data = data;
            } else {
                this.next.setNode(index, data);
            }
        }

        public boolean containsNode(E data) {
            if (this.data.equals(data)) {
                return true;
            } else {
                if (this.next == null) {
                    return false;
                } else {
                    return this.next.containsNode(data);
                }
            }
        }

        public void removeNode(Node previous, E data) {
            if (this.data.equals(data)) {
                previous.next = this.next;
            } else {
                if (this.next != null) {
                    this.next.removeNode(previous, data);
                }
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
            this.root.addNode(newNode);
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        this.foot = 0;
        this.returnData = new Object[this.count];
        this.root.toArrayNode();
        return this.returnData;
    }

    @Override
    public E get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E data) {
        if (index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }

    @Override
    public boolean contains(E data) {
        if (data == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    @Override
    public void remove(E data) {
        if (this.contains(data)) {
            if (this.root.containsNode(data)) {
                this.root = this.root.next;
            } else {
                this.root.next.removeNode(this.root, data);
            }
        }
        this.count--;
    }

    @Override
    public void clean() {
        this.root = null;
        this.count = 0;
    }
}

public class NodeDemo {
    public static void main(String[] args) {
        ILink<String> all = new ILinkImpl<String>();
        all.add("su");
        all.add("hai");
        all.add("dong");
        int count = all.size();
        boolean real = all.isEmpty();

        Object[] result = all.toArray();
        for (Object x : result) {
            System.out.println("---:" + x);
        }

        System.out.println(all.get(2));
        all.set(2, "shuai");
        System.out.println(all.get(2));

        System.out.println(all.contains("shuai"));


    }

}
