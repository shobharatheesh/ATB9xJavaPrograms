package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class PalindromeStringWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        //Performing operation

        palindrome(str);

    }
    public static void palindrome(String str)
    {
        boolean isPalindrome = true; //Assume string is palindrome intially

        int start = 0 ; //starting index
        int end = str.length() -1 ; //ending index

        //use while loop to compare characters from both ends

        while(start < end)
        {
            //if characters at the start and end do not match

            if(str.charAt(start) != str.charAt(end))
            {
                isPalindrome = false;
                break;
            }

            start ++;
            end--;
        }

        //print the result

        if(isPalindrome)
        {
            System.out.println(str + " is a palindrome");
        }
        else
        {
            System.out.println(str + " is not a palindrome");
        }
    }

}
