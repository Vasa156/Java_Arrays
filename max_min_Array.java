 //Write a program to find the maximum and minimum element in an array

import java.util.Scanner;
class max_min_Array
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("The Arrays limit : ");
          int value=input.nextInt();
          int b[]=new int[value];
          int max=0,min=0;
          for(int i=0;i<value;i++)
           {
               System.out.printf("the element of a[%d] : ",i);
               b[i]=input.nextInt();
           }
           max=b[0];
           min=b[0];
           for(int i=0;i<value;i++)
            {
                if(max<b[i])
                 {
                     max=b[i];
                 }
                 if(min>b[i])
                  {
                      min=b[i];    
                  }
            }
            System.out.println("The maximum number is : "+max);
            System.out.println("The minimum number is : "+min);  
      }
 }
 
