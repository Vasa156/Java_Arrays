//select positive numbers of array and sum
import java.util.Scanner;
 class pos_num_arr
  {
      public static void main(String args[])
       {
           Scanner in = new Scanner(System.in);
           System.out.print("Array Limit : ");
           int pos_arr=in.nextInt();
           int a[]=new int[pos_arr];
           int sum=0;
           for(int i=0;i<pos_arr;i++)
            {
             System.out.printf("element of a[%d] : ",i);
             a[i]=in.nextInt();
            }
            System.out.println("The Positive Elements are : ");
            for(int pos_tive : a)
             {
                 if(pos_tive>0)
                  {
                      System.out.println(pos_tive);
                      sum+=pos_tive;
                  }
                  
             }
             System.out.println("the sum of positive array is : "+sum);
            
       }
  }
