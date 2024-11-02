package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Scanner;

public class FindDuplicate {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] num = new int[size];


        System.out.println("Enter the values of the array you want to find duplicates: ");

       for(int i = 0 ; i < size ; i++)
       {
           num[i] = sc.nextInt();
       }

       for(int j =0 ; j<num.length ;j++)
       {
           for(int k =j+1 ; k<num.length;k++)
           {
               if(num[j] == num[k])
               {
                   System.out.println("Duplicate found");
               }
           }
       }
    }


}