package Oct_JavaCourse_ATB9X.ex_22102024;

import java.util.Scanner;

public class PalidromeOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        boolean isPalindrome = true;

        //get the length of the string
        int n = str.length();

        //use for loop to compare characters from both end

        for(int i =0 ;i < n / 2 ; i++)
        {
            if(str.charAt(i) != str.charAt(n - i -1))
            {
                isPalindrome = false;
            }
        }

        //print the result
        if(isPalindrome)
        {
            System.out.println(str + " is  a palindrome");
        }
        else
        {
            System.out.println(str +" is not a palindrome ");
        }
    }
}
