package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        //performing operation

       String result = reverse(str);
        System.out.println("Reversed string : " +(reverse(str)));

    }

    public static String reverse(String str) {
        String reversed =" ";

        for(int i = str.length() -1; i>=0 ; i--)
        {
            reversed = reversed + str.charAt(i);
        }
       return reversed;

    }
}
