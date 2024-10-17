//search  element in an array
import java.util.Scanner;
class Serach_element_Array
 {
     public static void main(String args[])
      {
          Scanner input = new Scanner(System.in);
          System.out.print("Size of the Array : ");
          int size_arr=input.nextInt();
          int store_arr[]=new int[size_arr];
          for(int i=0;i<size_arr;i++)
           {
            System.out.printf("Element of a[%d] : ",i);
            store_arr[i]=input.nextInt();
           }
           System.out.print("Search Element : ");
           int search=input.nextInt();
           int flag=0;
           int i;
           for( i=0;i<size_arr;i++)
            {
                if(store_arr[i]==search)
                 {
                     flag=1;
                     break;
                 }
            }
            if(flag==1)
             {
                 System.out.printf("\nposition : %d",i + 1);
                 System.out.printf("\nIndex : %d ",i);
             }
             else
              {
                  System.out.println("Not found");
              }
      }
 }
