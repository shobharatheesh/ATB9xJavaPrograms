package Oct_JavaCourse_ATB9X.ex_17102024_ifElse;

import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side A: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the value of side B: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the value of side C: ");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            System.out.println("It is a Equilateral Triangle(All sides are equal");
        }

        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {

            System.out.println(" It is a Isosceles Triangle(two sides are equal");
        }
        else {

            System.out.println(" it is a Scalene triangle(no sides are equal)");
        }
    }
}
