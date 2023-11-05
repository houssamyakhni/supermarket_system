
package project.data;


public class Tree {
    Node root;

    public Tree() {
    }
    public boolean isEmpty(){
        return root==null;
    }public Node post_order(Node r){
        if(r!=null){
        post_order(r.left);
        post_order(r.right);
            System.out.println(r.data);
        
    }
        
        return r;
        
        
    }public void post_order(){
        post_order(root);
    }public Node pre_order(Node r){
        if(r!=null){
            System.out.println(r.data);
            pre_order(r.left);
            pre_order(r.right);
        }
        return r;
    }public void pre_order(){
        pre_order(root);
    }public Node inOrder(Node r){
        if(r!=null){
        inOrder(r.left);
                    System.out.println(r.data);
        inOrder(r.right);
        }
        return r;
    }
    
    public void inOrder(){
        inOrder(root);
    }
    
    public Node insert(Node r,int data){
        if(r==null){
            r=new Node(data);
        }
        else{
            if(r.data>=data){
                isEmpty();
                r.left=insert(r.left,data);
            }
            else{
                r.right=insert(r.right,data);
            }
        }
        return r;
    }
    
    public void insert(int data){
        root=insert(root,data);
    }
    
    public Node delete(Node r,int data){
        if(r==null){
            return r;
        }
        else{
            if(r.data>data){
               r.left=delete(r.left,data); 
            }
            else if(r.data<data){
                r.right=delete(r.right,data);
            }
            else{
              if(r.left==null){
                  return r.right;
              } 
              else if(r.right==null){
                  return r.left;
              }
              else{
                  r.data=minvalue(r.right);
                  r.right=delete(r.right,data);
              }
            }
        }
        return r; 
    }
    
    public void delete(int data){
        if(isEmpty()){
            System.out.println("is empty");
        }
        else
        root=delete(root,data);
    }
    
    public int minvalue(Node r){
        int min=r.data;
        while(r.left!=null){
            min=r.left.data;
            r=r.left;
        }
        return min;
    }
    
    public boolean search(Node r,int data){
        if(r==null){ 
            return false;
        }
        else{
            if(r.data==data){
                return true;
            }
            else if(r.data>data){
               return search(r.left,data);
            }
            else if(r.data<data){
                return search(r.right,data);
            }
        }
        return false;
    }
    
    public boolean search(int data){
        return search(root,data);
    }
    
    public int count(Node r){
        if(r==null){
            return 0;
        }
        else{
           return 1+count(r.left)+count(r.right);
        }
    }
    
    public int count(){
        return count(root);
    }
    
    public int countleaf(Node r){
        if(r==null){
            return 0;
        }
        else {
            if(r.right==null&&r.left==null){
                return 1;
            }
            else{
                return countleaf(r.right)+countleaf(r.left);
            }
        }
    }
    
    public int countleaf(){
        return countleaf(root);
    }
    
}
