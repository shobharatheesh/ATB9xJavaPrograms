package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Scanner;

public class LeftTriangleStar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for( int i = n ;i >= 0 ;i--)

        {
            for(int j =0 ; j < i; j++) //only for printing number of stars
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }




    }
}
