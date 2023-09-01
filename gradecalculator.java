import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks out of 100 in physics: ");
        float a=sc.nextFloat();
        System.out.println("enter the marks out of 100 in chemistry: ");
        float b=sc.nextFloat();
        System.out.println("enter the marks out of 100 in maths: ");
        float c=sc.nextFloat();
        System.out.println("enter the marks out of 100 in biology: ");
        float d=sc.nextFloat();
       float sum=a+b+c+d;
       float average=sum/4f;
       System.out.println("total marks is: " +sum);
       System.out.println("the average percentage is: " +average + "%") ;
       if(average>=90){
        System.out.println("GRADE A+");
       }
        else if(average>=75 && average<90){
            System.out.println("GRADE A");;

        }
        else if(average>=60 && average<75){
            System.out.println("GRADE B");
        }
        else if(average>=40 && average<25){
            System.out.println("GRADE C");
        }
        else{
            System.out.println("GRADE D");

        }

    }

    
}
