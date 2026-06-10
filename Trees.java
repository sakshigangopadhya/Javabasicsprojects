class Node {
    int key;
    Node left, right;
    public Node(int x) {
        key = x;
        left = right = null;
    }
}

class Trees {
    Node root;
    void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }

        
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }
    void postOrder(Node root) {
        if (root == null) {
            return;
        }

        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key + " ");
    }
        

    public static void main(String[] args) {
        Trees tree = new Trees();
        tree.root = new Node(10);
        tree.root.left = new Node(15);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right= new Node(9);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(4);

        System.out.println("Preorder Traversal: ");
        tree.preOrder(tree.root);
        System.out.println("");
        System.out.println("inOrder Traversal: ");
        tree.inOrder(tree.root);
        System.out.println("");
        System.out.println("PostOrder Traversal: ");
        tree.postOrder(tree.root);

    }
}