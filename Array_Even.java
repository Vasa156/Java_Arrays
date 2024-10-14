//Write a program to array elements print all Even number & sum
 
 import java.util.Scanner;
 class Array_Even
  {
      public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           System.out.print("The Array Limit : ");
           int even=input.nextInt();
           int arr_even[]=new int[even];
           int sum=0;
           for(int i=0;i<even;i++)
            {
                System.out.printf("a[%d] is : ",i);
                arr_even[i]=input.nextInt();
            }
            System.out.println("The even number : ");
            for(int j:arr_even)
             {
                 if(j%2==0)
                  {
                      System.out.println(j);
                      sum+=j;
                  }
                  
             }
           System.out.println("The sum of Odd array : "+sum);
       }
  }
