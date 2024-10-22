package Oct_JavaCourse_ATB9X.ex_22102024;

import java.util.Scanner;

public class PalidromeStringWhile {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

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

        sc.close();

    }
}
