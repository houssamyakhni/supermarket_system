
package project.data;


public class Node {
    
     String object;
     int data;
    Node next;
    Node left;
    Node right;

    public Node() {

    }

    public Node(int a) {
        this.data = a;
        next=null;
    }

    public Node(String object) {
        this.object = object;
    }
                                                                                
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    
    
}
