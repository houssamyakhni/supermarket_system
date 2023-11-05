
package project.data;


public class LinkedList {
  Node first;

    public LinkedList() {
    }
  public boolean isEmpty(){
      return first==null;
  }public void add_first(int c){
      Node S=new Node(c);
   
   if(isEmpty())
       
       
       first=S;
   else{
   S.next=first;
   first=S;
   }
  }public void add_last(int c){
      Node t=new Node(c);
      if(isEmpty()){
          first=t;
      }else{
          Node b=first;
          while(b.next!=null){
              b=b.next;
              
          }b.next=t;
      }
  }public int searchValue(int a){
      Node s=first;
      while(s.next!=null){
          if(s.data==a){
              return a;
          }s=s.next;
      }return 0;
  }public void deletAtindex(int a){
      Node tmp=first;
      if(a==0){
          first=first.next;
      }int i=0;
      while(tmp.next!=null&&i<a-1){
          tmp=tmp.next;
          i++;
      }tmp.next=tmp.next.next;
  }public void display(){
       if (isEmpty()) {
            System.out.println("Empty");
        } else {
            Node d = first;
            while (d.next!= null) {
                System.out.print( d.data+ "  ");
                d = d.next;
            }System.out.println(d.data);
        }
    }public void  delet_first(){
        first=first.next;
    }public void add_index(int d,int pos){
        Node n=new Node(d);
        Node t=first;
        int i=0;
        if(pos==0){
            first=t;
        }while(t.next!=null){
            if(i==pos){
                Node tmp=t.next;
                t.next=n;
                n=t;
            }i++;
            t=t.next;
        }
    }
    public void display1(){
        if(isEmpty()){
            System.out.println("is empty");
        }else{
            Node tmp=first;
            while(tmp.next!=null){
                System.out.print(tmp.object+"-->");
                tmp=tmp.next;
            }System.out.print(tmp.object);
        }
    }
    public void add_first_element(String  c){
      Node S=new Node(c);
   
   if(isEmpty()) first=S;
   else{
   S.next=first;
   first=S;
   }
  }public void add_element_last(String c){
      Node t=new Node(c);
      if(isEmpty()){
          first=t;
      }else{
          Node b=first;
          while(b.next!=null){
              b=b.next;
              
          }b.next=t;
      }}public void delet_last(){
          Node delet=first;
          while(delet.next.next!=null){
              delet=delet.next;
          }delet.next=null;
      }  public boolean searchValue(String a){
        Node s=first;
        while(s.next!=null){
            if(s.object==a){
               return true; 
            }
            s=s.next;
        }
        return false;
    }
    
}

