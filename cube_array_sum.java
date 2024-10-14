// sum of cube
 import java.util.Scanner;
 class cube_array_sum
  {
      public static void main(String args[])
       {
           Scanner input = new Scanner(System.in);
           System.out.print("Enter the array size : ");
           int array=input.nextInt();
           int arr[]=new int[array];
           int sum=0;
           for(int i=0;i<array;i++)
             {
                 System.out.printf("The element of a[%d] is : ",i);
                 arr[i]=input.nextInt();
             }
            for(int num : arr)
             {
                 sum=sum+(num*num*num);
                
             }
             System.out.println("The sum of cube : "+sum);
       }
  }
