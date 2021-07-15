import org.w3c.dom.Node;

/**
 * @Author:Tsx
 * @Date:2021-07-09- 20:07
 * 二叉查找树
 */
public class BinarySearchTree {

    // 二叉查找树，指向根节点
    private Node tree;

    public Node find(int value) {
        Node parent = tree;
        while (parent != null) {
            if (parent.value > value) {
                parent = parent.left;
            } else if (parent.value < value) {
                parent = parent.right;
            } else {
                return parent;
            }
        }
        return parent;
    }

    public boolean put(int value) {
        if (tree == null) {
            tree = creatNode(value);
            return true;
        }
        Node parent = tree;
        while (parent != null) {
            // 左子树
            if (parent.value > value) {
                if (parent.left == null) {
                    parent.left = creatNode(value);
                    return true;
                }
                parent = parent.left;
            }
            //右子树
            else if (parent.value < value) {
                if (parent.right == null) {
                    parent.right = creatNode(value);
                    return true;
                }
                parent = parent.right;
            }
        }
        //相等返回false
        return false;
    }

    private Node createNode(Node left, int value, Node right) {
        return new Node(left, value, right);
    }

    private Node creatNode(int value) {
        return createNode(null, value, null);
    }

    // 定义一个二叉树结构
    private static class Node {
        private int value;
        private Node left;
        private Node right;

        protected Node(Node left, int value, Node right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue() {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight() {
            this.right = right;
        }
    }
}
