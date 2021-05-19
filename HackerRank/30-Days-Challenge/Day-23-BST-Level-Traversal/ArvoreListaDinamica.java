import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class ArvoreRemoverDinamico{

static void levelOrder(Node root) {
    
    if(root != null) {
        Queue<Node> raizes = new LinkedList<>();
        raizes.add(root);
        
        while(raizes.size() > 0) {
            Node aux = raizes.remove();
            System.out.print(aux.data + " ");
            
            if(aux.left != null) {
                raizes.add(aux.left);
            }
            if(aux.right != null) {
                raizes.add(aux.right);
            }
        }
    }
}



public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
