package bai1tuan4;

    class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        int arr[] = {6,66,669,69,96,99,12,34,34,64,22};
        for (int i : arr) {
            bst.insert(i);
        }
        System.out.println(bst.BinarySearch(1));
    }
}
public class BST {
    class Node {
        int data;
        Node left, right;
        
        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    Node root;
    BST(){
        root = null;
    }
    BST(int data){
        root = new Node(data);
    }
//    Chèn Node
    public void insert(int data){
        root = insertNode(root,data);
    }
    public Node insertNode(Node root,int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);
        return root;
    }
//    Xóa Node
    void deleteKey(int data) { 
        root = deleteNode(root, data); 
    }
    Node deleteNode(Node root, int data){
        if (root == null)
            return root;
        if (data < root.data)
            root.left = deleteNode(root.left, data);
        else if (data > root.data)
            root.right = deleteNode(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    
    boolean check = false;
    
//tim kiem
    public boolean Search(Node node, int key){
        if (node != null){
            Search(node.left, key);
            if(key == node.data){
                check = true;
            }
            Search(node.right, key);
        }
        return check;
    }
    public boolean BinarySearch(int key){
        return Search(root, key);
    }

}

