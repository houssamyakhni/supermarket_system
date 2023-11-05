package project.data;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectData {
    
    
    public  static void display_Menu(){
        System.out.println("1.enter in id of 1 employee");
        System.out.println("2.Remove in employee");
        System.out.println("3.print the id of employee");
        System.out.println("4.Close the system");
    }
    
    public  static void display_Menu1(){
        System.out.println(" press 1 to enter the element");
        System.out.println(" press 2 to Remove this element");
        System.out.println(" press 3 to print the element");
        System.out.println("press 4  to Close the system");
    }
     public  static void display_Menu2(){
        System.out.println("1. to enter the price of element ");
        System.out.println("2. to print  the total price");
        System.out.println("3. if we have discount");
        System.out.println("4.to print the price of element respectivement");
         System.out.println("5.to exit");
    }public static void display_Menu3(){
            System.out.println("1.to calculate the grade");
             System.out.println("2.to exit");
    }

    public static void main(String[] args) {
     ArrayList al=new ArrayList();
     Scanner in=new Scanner(System.in);
     
    while(true){
         display_Menu();
         int chose;
         chose=in.nextInt();
         if(chose==1){
             al.add(in.nextInt());
             System.out.println("added");
         }else if(chose==2){
                 System.out.println("enter the number to remove : ");
           int x=in.nextInt();
          al.remove(x);
             System.out.println("Removed");
            
         }else if(chose==3){
             System.out.println("the id of employee is: "+al);
         }else{
             break;
         }
     }
    LinkedList s1=new LinkedList();
     while(true){
         display_Menu1();
         int x;
         x=in.nextInt();
         if(x==1){
             s1.add_element_last(in.next());
         }else if(x==2){
             System.out.println("if will we you delet the first press 1");
             System.out.println("if will we you delet the last press 2");
             System.out.println("if will we you delet with index press 3");
             int z;
             z=in.nextInt();
             if(z==1){
                 s1.delet_first();
             }else if(z==2)
             {
                 s1.delet_last();
             }
             else if(z==3){
                 
                 s1.deletAtindex(in.nextInt());
             }
         }else if(x==3){
             s1.display1();
         }
         
         else{
             break;
         }
     }
     Stack Ar=new Stack();
        System.out.println("enter the price of this Element");
     s1.display1();
     while(true){
         display_Menu2();
         int choise;
         choise=in.nextInt();
         if(choise==1){
             Ar.push(in.nextInt());
         }
         
         
         else if(choise==2){
             System.out.println("the total price is "+Ar.summ()+"$");
         }else if(choise==3){
               System.out.println("you have a 25% discount"+Ar.divisr());
         }else if(choise==4){
             System.out.println("the price of element respectivement");
            Ar.display();
         }   else{
             break;
         }
         
     }
     
    Employee E1=new Employee();
    
        System.out.println("in Exam for job applicants");
  while(true){
      int choisir;
      display_Menu3();
      choisir=in.nextInt();
      
      if(choisir==1){
          E1.grade_of_Employee();
      }else if(choisir==2){
          break;
      }
  }
    Employee L1=new Employee();
    L1.Company_profits();
   
        System.out.println("ente the age of this 10 Employee");
        
        
        Queue z=new Queue(10);
        
       
            System.out.println("the age of Employee is ");
            
                z.enqueu((64));
                z.enqueu((62));
                z.enqueu((60));
                z.enqueu((55));
                z.enqueu((50));
                z.enqueu((40));
                z.enqueu((39));
                z.enqueu((39));
                z.enqueu((38));
                z.enqueu((35));
    
                
                System.out.println("after 10 year this Employee taka3ado");
                
                System.out.println(z.dequeue());
                System.out.println(z.dequeue());

                System.out.println(z.dequeue());

                System.out.println(z.dequeue());
                
                
                
                
                Tree B1=new Tree();
                System.out.println("the Delivey distence en K.m is 10 76 12 15 13 3");
                B1.insert(10);
                B1.insert(7);
                B1.insert(6);
                B1.insert(12);
                B1.insert(15);
                B1.insert(13);
                B1.insert(3);
                System.out.println(" the count is"+B1.count());
                System.out.println(" the count leaf is"+B1.countleaf());
                
               System.out.println(" How would you like to deliver ?");
               System.out.println(" press 1 to deliver in in_order");
               System.out.println("press 2 to deliver in post_order ");
               System.out.println(" press 1 to deliver in pre_order");
                   int choiser;
                   choiser=in.nextInt();
                   
        switch (choiser) {
            case 1:
                B1.inOrder();
                break;
            case 2:
                B1.pre_order();
                break;
            default:
                B1.post_order();
                break;
        }
     
        System.out.println("the worls is 7 km away");
        
        System.out.println(B1.search(7));
        System.out.println("if true delet 7");
        B1.delete(7);
               
            }
        }
    

   
 