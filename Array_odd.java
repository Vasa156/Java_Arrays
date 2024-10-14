//Write a program to array elements print all Odd number & sum
 
 import java.util.Scanner;
 class Array_odd
  {
      public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           System.out.print("Arrays Limit : ");
           int odd_array = input.nextInt();
           int arr[]=new int[odd_array];
           int sum=0;
           for(int i=0;i<odd_array;i++)
            {
                System.out.printf("the element of a[%d] :" ,i);
                arr[i]=input.nextInt();
            }
            System.out.println("The Odd numbers are : ");
            for(int num:arr)
             {
                 if(num%2==1)
                  {
                      System.out.println(num);
                      sum+=num;
                  }
             }
             System.out.println("The sum of Odd array number is : "+sum);
       }
  }
 
