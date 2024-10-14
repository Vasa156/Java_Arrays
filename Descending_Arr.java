 // Write a program to Sort Numeric Array In Descending Order
 import java.util.Arrays;
 import java.util.Collections;
 class Descending_Arr
  {
      public static void main(String args[])
       {
           Integer num[]={23,8,9,45,78,897,456,980,3,5,2,7,8};
           System.out.println("The original Array : "+Arrays.toString(num));
           Arrays.sort(num,Collections.reverseOrder());
           System.out.println("The Descending Array is : "+Arrays.toString(num));
       }
  }
