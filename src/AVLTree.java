class Node {
    int data, height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 1;
        this.left = this.right = null;
    }
}

public class AVLTree {
    private Node root;

    public AVLTree() {
        this.root = null;
    }

    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private void updateHeight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        } else {
            return root;
        }

        updateHeight(root);

        int balance = getBalance(root);

        if (balance > 1) {
            if (data < root.left.data) {
                return rightRotate(root);
            } else {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        } else if (balance < -1) {
            if (data > root.right.data) {
                return leftRotate(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }
        }

        return root;
    }

    public void printTree() {
        printTree(root);
    }

    private void printTree(Node root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.data + " ");
            printTree(root.right);
        }
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        int[] nodesToInsert = {45, 27, 67, 36, 56, 15, 75, 31, 53, 39, 64};
        for (int node : nodesToInsert) {
            avlTree.insert(node);
        }

        System.out.println("AVL Tree after insertion:");
        avlTree.printTree();

        int[] additionalNodes = {32, 42, 52, 62};
        for (int node : additionalNodes) {
            avlTree.insert(node);
            System.out.println("\nAVL Tree after inserting " + node + ":");
            avlTree.printTree();
        }
    }
}
