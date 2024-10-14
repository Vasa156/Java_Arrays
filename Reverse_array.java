// Write a program in to read n number of values in an array and display it in reverse order

import java.util.Scanner;
class Reverse_array
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter the Array  size : ");
          int arr=input.nextInt();
          int a[]=new int[arr];
          for(int i=0;i<arr;i++)
            {
                System.out.printf("The Element of a[%d] : ",i);
                a[i] = input.nextInt();
            }
            System.out.println("The original array is : ");
           for(int num:a)
             {
                 System.out.println(num);
             }
            System.out.println("The Reverse Array is : ");
            for(int i=arr-1;i>=0;i--)
             {
                 System.out.println(a[i]);
             }
      }
 }
