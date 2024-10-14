// Write a program to store elements in an array and print it

import java.util.Scanner;
class Store_Display
 {
     public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           
           System.out.print("Array size : ");
           int arr=input.nextInt();
           int a[]=new int[arr];
           for(int i=0;i<arr;i++)
            {
                System.out.printf("The Element of a[%d] : ",i);
                 a[i]=input.nextInt();
            }
            System.out.println("Display the array element : ");
            for(int num:a)
            {
                System.out.println(num);
            }
       }
 }
 
