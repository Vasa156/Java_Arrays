//negative number of array and sum
import java.util.Scanner;
  class neg_num_arr
   {
       public static void main(String args[])
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Array Limit : ");
            int neg_arr=in.nextInt();
            int b[]=new int[neg_arr];
            int sum=0;
            for(int i=0;i<neg_arr;i++)
             {
                 System.out.printf("a[%d] : ",i);
                 b[i]=in.nextInt();
             }
             System.out.println("The negative numbers are : ");
             for(int num:b)
              {
                  if(num<0)
                   {
                       System.out.println(num);
                       sum+=num;
                   }
              }
              System.out.println("The sum of Negativee Number is : "+sum);
        }
   }
