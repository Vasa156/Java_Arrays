//Write a program to Sort Numeric Array In Ascending Order

import java.util.Arrays; //import the array
class ascending_Array
 {
     public static void main(String args[])
      {
          int num[]={12,34,56,7,89,4,3,6,4,5,0,1,2,7,87,45,67,43};
          System.out.println("The number of length  is : "+num.length); //the original length
          System.out.println("The original Number : "+Arrays.toString(num)); //chaange the int num value to String value
          Arrays.sort(num); // ascending math function
          System.out.println("The Ascending Number : "+Arrays.toString(num));
      }
 }
