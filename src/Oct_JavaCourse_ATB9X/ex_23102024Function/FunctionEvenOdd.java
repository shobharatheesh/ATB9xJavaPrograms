package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionEvenOdd {
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        //Perform operation
        if(evenOdd(num))
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The Number is odd");
        }

    }

    public static boolean evenOdd(int num)
    {
        return num % 2 == 0;
    }
}
