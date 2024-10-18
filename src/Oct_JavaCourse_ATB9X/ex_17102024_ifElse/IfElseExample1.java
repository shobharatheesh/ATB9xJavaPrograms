package Oct_JavaCourse_ATB9X.ex_17102024_ifElse;

import java.util.Scanner;

public class IfElseExample1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side1: ");
        double side1 = sc.nextDouble();

        System.out.println("Enter the length of side2: ");
        double side2 = sc.nextDouble();

        System.out.println("Enter the length of side3: ");
        double side3 = sc.nextDouble();

        if (side1 <=0 || side2 <=0 || side3 <=0) // OR statement
        {
            System.out.println("Invalid Side lengths");
        }
        else if (side1==side2 && side2==side3 && side1==side3)
        {
            System.out.println("The traingle is equilateral");
        }
        else if(side1==side2 || side2==side3 || side1==side3)
        {
            System.out.println("The triangle is isoceles");
        }
        else{

            System.out.println("The triangle is scalene");
        }

        sc.close();


    }
}
