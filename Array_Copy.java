//Array copy
import java.util.Scanner;
class Array_Copy
 {
     public static void main(String args[])
      {
        Scanner input = new Scanner(System.in);
        System.out.print("Array Limit : ");
        int org_arr=input.nextInt();
        int b[]=new int[org_arr];
        int c[]=new int[org_arr];
        for(int i=0;i<org_arr;i++)
         {
             System.out.printf("element of a[%d] :",i);
             b[i]=input.nextInt();
         }
         for(int i=0;i<org_arr;i++)
          {
              c[i]=b[i];
          }
          System.out.println("The original array : ");
          for(int i=0;i<org_arr;i++)
           {
               System.out.printf("\nb[%d] = %d :",i,b[i]);
           }
           System.out.println("\nThe copy of array : ");
           for(int i=0;i<org_arr;i++)
            {
                System.out.printf("\nc[%d] = %d : ",i,c[i]);
            }
         
      }
     
 }
