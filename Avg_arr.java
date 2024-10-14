 // Write a program to calculate the average value of array elements
import java.util.Scanner;
class Avg_arr
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("How many subject : "); //declare the subject number
          int sub=input.nextInt();
          int a[]=new int[sub]; //hold th subject number here
          int sum=0;
          for(int i=0;i<sub;i++) //use forloop
           {
               System.out.printf("The subject [%d] Mark is : ",i);
               a[i]=input.nextInt();
           }
           for(int num:a)
            {
                sum+=num;  
            }
            double avg=(double)sum/sub;
            System.out.println("The Sum of array is : "+sum);
            System.out.println("The Average of array is : "+avg);
            input.close(); 
      }
 }
