  //Write a program to print sum values of an array

import java.util.Scanner;
class Sum_array
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("enter the Size of the Element : ");
          int size = input.nextInt();
          int a[]=new int[size];
          int sum=0;
          for(int i=0;i<size;i++) 
           {
               System.out.printf("The element value [%d] : ",i);
               a[i]=input.nextInt();
           }
           for(int num:a)
           {
               sum+=num;
           }
           System.out.println(sum);    
      }
 }
