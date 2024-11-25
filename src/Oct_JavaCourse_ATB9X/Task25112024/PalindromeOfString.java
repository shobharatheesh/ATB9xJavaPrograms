package Oct_JavaCourse_ATB9X.Task25112024;

import java.util.Scanner;

public class PalindromeOfString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();

        boolean isPalindrome = true;
        //get the length of the String
        int n = s.length();

        //use for loop to compare charaters from both end
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1))
            {
                isPalindrome = false;
            }
        }


        //print the result

        if(isPalindrome)
        {
            System.out.println(s + " is a Palindrome");
        }
        else{
            System.out.println(s + " is not a Palindrome");
        }
    }
}
