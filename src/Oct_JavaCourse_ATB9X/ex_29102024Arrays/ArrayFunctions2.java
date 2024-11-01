package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Scanner;

public class ArrayFunctions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the numbers : ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size ; i++)
        {
            System.out.println("Enter the number "+(i+1));
            numbers[i] = sc.nextInt();
        }

        System.out.println("The numbers are : ");
        for(int i =0 ; i <size ; i++)
        {
            System.out.print(numbers[i] +" ");
        }

    }
}