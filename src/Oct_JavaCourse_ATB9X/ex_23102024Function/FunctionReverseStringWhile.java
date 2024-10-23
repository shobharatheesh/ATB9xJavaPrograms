package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionReverseStringWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        //performing operation

        System.out.println("The reversed string is : " +reverse(str));

    }

    public static String reverse(String str) {

        String reversed ="";
        int i = str.length() -1;

        while(i >=0)
        {
            reversed = reversed + str.charAt(i);
            i--;
        }

        return reversed;

    }
}
