
package project.data;
import java.util.Scanner;

public class Employee  {

    public Employee() {
        
        
    }
    
   
    public void grade_of_Employee(){
        int ar[]=new int[5];
        int total=0;
double average;
int y[] = new int[5];
Scanner in=new Scanner(System.in);
System.out.println("enter the grade of Math,phy,chemstry,Eng,programming,respectivement ");
for(int i=0;i<y.length;i++)
{
y[i]=in.nextInt();
}
for(int j=0;j<y.length;j++)
total=total+y[j];
average=total/5.;


System.out.println("The sum is: " +total);
System.out.println("The average is: "+average);

if(average>=70){
    System.out.println("you are accept");
}else if(average<=70){
    System.out.println("you failed");
}



}
    
    public void Company_profits(){
        Scanner in=new Scanner(System.in);
        int kr[]=new int[1];
        int sum=0;
        int salery=1500;
        int Winner;
        for(int i=0;i<kr.length;i++){
            System.out.println("Enter the total number of Employee");
            kr[i]=in.nextInt();
            System.out.println("the salery of This Employee is 1500$ in month");
            sum=salery*kr[i];
            System.out.println("the total salery is"+sum+"$");
            
            System.out.println("Enter the Company profits");
            int x;
            x=in.nextInt();
            Winner=x-sum;
            if(Winner<=0){
                Winner=-Winner;
                System.out.println("the Company loss"+Winner+"$");
            }else {
                System.out.println("the Company winn"+Winner+"$");
            }
        }
    }



}
      
    




   

