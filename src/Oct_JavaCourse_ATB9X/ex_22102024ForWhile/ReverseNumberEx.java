package Oct_JavaCourse_ATB9X.ex_22102024ForWhile;

import java.util.Scanner;

public class ReverseNumberEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int reverse = 0;

        for(;num != 0 ; num = num/10)
        {

            int remainder = num % 10;
            reverse = reverse * 10 +remainder;

        }

        System.out.println("Reverse of the given number is : "+reverse);
    }

}
