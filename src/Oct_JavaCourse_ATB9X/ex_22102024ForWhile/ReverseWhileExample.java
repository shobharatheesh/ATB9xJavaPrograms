package Oct_JavaCourse_ATB9X.ex_22102024ForWhile;

import java.util.Scanner;

public class ReverseWhileExample{

    public static void main(String[] args) {

        Scanner  sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int reverse =0;

        while(num !=0)
        {
            int remainder = num %10;
            reverse = reverse *10 +remainder;
            num = num/10;
        }
        System.out.println("Reverse of the number : "+reverse);
    }
}
