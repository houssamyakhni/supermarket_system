
package project.data;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList {

    public arrayList() {
    }
    public static void displayMenu(){
        
System.out.println();
System.out.println("1.add");
System.out.println("2.remove");
System.out.println("3.size");
System.out.println("4.exit");
System.out.println();
System.out.println(" enter you choice");
        
    }
    public void array(){
        int choice;
        Scanner in=new Scanner(System.in);
        ArrayList al=new ArrayList();
        while(true){
            displayMenu();
            choice=in.nextInt();
            if(choice==1){
                 System.out.println("enter the element : ");
                al.add(in.next());
                 System.out.println("added ");
            }else if(choice==2){
                 System.out.println("enter the number to remove : ");
           int elementEoRemove=in.nextInt();
           if(al.contains(elementEoRemove)){
               al.remove(Integer.valueOf(elementEoRemove));
               System.out.println("removed");
            }
            
        
        }
             else if(choice==3){
            
           System.out.println("your list is "+al);
        }
      else  if(choice==4){
            System.out.println("bay bay");
            break;
            
            
            
        }
    }
        
        System.out.println(al.size());
    }
    
}
