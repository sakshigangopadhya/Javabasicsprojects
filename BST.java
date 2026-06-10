class Node {
    int key;
    Node left, right;

    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

class BST {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.key + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.key + " ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();

        int[] elements = {
            47, 82, 12, 68, 25, 93, 54, 1,
            76, 39, 60, 18, 85, 31, 70
        };

        for (int element : elements) {
            tree.root = tree.insert(tree.root, element);
        }

        System.out.println("Preorder Traversal:");
        tree.preOrder(tree.root);

        System.out.println("\n\n*Inorder Traversal:");
        tree.inOrder(tree.root);

        System.out.println("\n\nPostorder Traversal:");
        tree.postOrder(tree.root);
    }
}