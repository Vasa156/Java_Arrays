// Write a program to array elements to print cubic values
 
 import java.util.Scanner;
 class cube_array
  {
      public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the array size : ");
           int array=input.nextInt();
           int arr[]=new int[array];
           for(int i=0;i<array;i++)
             {
                 System.out.printf("The element of a[%d] is : ",i);
                 arr[i]=input.nextInt();
             }
            System.out.println("cube Array Elements : ");
            for(int num : arr)
             {
                System.out.println(num*num*num);
             }
       }
  }
