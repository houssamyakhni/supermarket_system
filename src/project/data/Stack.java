
package project.data;


public class Stack extends LinkedList {

    public Stack() {
        super();
    }@Override
    public boolean isEmpty(){
        return super.isEmpty();
    }public void push(int a){
        super.add_first(a);
    }public int pop(){
        int i=super.first.data;
        super.delet_first();
        return i;   
    }public int summ(){
        int sum=0;
        Stack s=new Stack();
        while(!isEmpty()){
            int tmp=this.pop();
            s.push(tmp);
            sum=sum+tmp;
        }
        while(s.first!=null){
            this.push(s.pop());
        }return sum;
    }public double avg(){
        int sum=0;
        int size=0;
        double avg;
        Stack s2=new Stack();
        while(!isEmpty()){
            int tmp=this.pop();
            s2.push(tmp);
            sum=sum+tmp;
            size++;
            
        }while(s2.first!=null){
            this.push(s2.pop());
        }avg=sum/size;
        return avg;        
    
}public void display(){
    super.display();
}
public double divisr(){
        int sum=0;
        int size=0;
        double avg;
        Stack s2=new Stack();
        while(!isEmpty()){
            int tmp=this.pop();
            s2.push(tmp);
            sum=sum+tmp;
            size++;
            
        }while(s2.first!=null){
            this.push(s2.pop());
        }avg=sum/1.5;
        return avg;        
    
}
}
