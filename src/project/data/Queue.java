
package project.data;


public class Queue  {
     int maxesize;
     int front;
     int rear;
     int size;
     int queuearray[];

    public Queue(int maxesize) {
        this.maxesize = maxesize;
        this.front = 0;
        this.rear = -1;
        this.size =0;
        this.queuearray=new int[maxesize];
    }
    public boolean isFull(){
        return maxesize==size;
    }public boolean isEmpty(){
        return size==0;
    }
     public void enqueu(int data){
         if(isFull()){
             System.out.println("Queue is Full");
         } else if(rear==maxesize-1){
             rear=-1;
         }queuearray[++rear]=data;
         System.out.println(data+" ans");
         size++;
     }public int dequeue(){
         if(isEmpty()){
             System.out.println("isEmpty");
     }int result=queuearray[front++];
     if(front==size){
         front=0;
     }size--;
     return result;
    
     }
     
     
     public int size(){
         return size;
     }
  
}
