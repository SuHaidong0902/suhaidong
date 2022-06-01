package util.commonUtil;

/**
 * @Author: suhaidong
 * @DATE: 2021/5/26
 * @Description: TODO
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {

    }
}

class BinaryTree<T extends Comparable<T>> {
    private class Node {
        private Comparable<T> data;
        private Node parent;
        private Node left;
        private Node right;

        public Node(Comparable<T> data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (newNode.data.compareTo((T) this.data) <= 0) {
                if (this.left == null) {
                    this.left = newNode;
                    newNode.parent = this;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                    newNode.parent = this;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

    }
}

