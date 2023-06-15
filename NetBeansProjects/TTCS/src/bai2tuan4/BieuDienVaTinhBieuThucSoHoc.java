// code:
// name:
package bai2tuan4;

/**
 *
 * @author Pom
 */
import java.util.Stack;
import java.lang.*;
class Node{
    char data;
    Node left,right;
    public Node(char data){
        this.data = data;
        left = right = null;
    }
}
 
public class BieuDienVaTinhBieuThucSoHoc {
    public static boolean isOperator(char ch){
        if(ch=='+' || ch=='-'|| ch=='*' || ch=='/' || ch=='^'){
            return true;
        }
        return false;
    }
    public static Node expressionTree(String postfix){
        Stack<Node> st = new Stack<Node>();
        Node t1,t2,temp;
 
        for(int i=0;i<postfix.length();i++){
            if(!isOperator(postfix.charAt(i))){
                temp = new Node(postfix.charAt(i));
                st.push(temp);
            }
            else{
                temp = new Node(postfix.charAt(i));
                t1 = st.pop();
                t2 = st.pop();
                temp.left = t2;
                temp.right = t1; 
                st.push(temp);
            }
        }
        temp = st.pop();
        return temp;
    }
    public static void inorder(Node root){
        if(root==null) return;
 
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
    }
    
    
    
    public static void main(String[] args) {
        String postfix = "126*+3/";
        Node r = expressionTree(postfix);
        inorder(r);
    }
}
 
class TinhGiaTri{
     
Node root;
public static class Node
{
    String data;
    Node left, right;
 
    Node(String d)
    {
        data = d;
        left = null;
        right = null;
    }
}

private static int toInt(String s)
{
    int num = 0;
    if (s.charAt(0) != '-')
        for(int i = 0; i < s.length(); i++)
            num = num * 10 + ((int)s.charAt(i) - 48);
    else
    {
        for(int i = 1; i < s.length(); i++)
          num = num * 10 + ((int)(s.charAt(i)) - 48);
        num = num * -1;
    }
    return num;
}
public static int evalTree(Node root)
{
    if (root == null)
        return 0;
    if (root.left == null && root.right == null)
        return toInt(root.data);
    int leftEval = evalTree(root.left);
    int rightEval = evalTree(root.right);
    if (root.data.equals("+"))
        return leftEval + rightEval;
 
    if (root.data.equals("-"))
        return leftEval - rightEval;
 
    if (root.data.equals("*"))
        return leftEval * rightEval;
 
    return leftEval / rightEval;
}
 
// Driver code
public static void main(String[] args)
{
    Node root = new Node("+");
    root.left = new Node("*");
    root.left.left = new Node("5");
    root.left.right = new Node("-4");
    root.right = new Node("-");
    root.right.left = new Node("100");
    root.right.right = new Node("20");
    System.out.println(evalTree(root));
    
    root = null;
    root = new Node("+");
    root.left = new Node("*");
    root.left.left = new Node("5");
    root.left.right = new Node("4");
    root.right = new Node("-");
    root.right.left = new Node("100");
    root.right.right = new Node("/");
    root.right.right.left = new Node("20");
    root.right.right.right = new Node("2");
    System.out.println(evalTree(root));
}
}
