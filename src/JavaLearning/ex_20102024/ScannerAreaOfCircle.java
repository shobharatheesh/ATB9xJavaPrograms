package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerAreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input the radius of the circle
        System.out.println("Enter the radius of the circle : ");
        double rad = sc.nextDouble();

        //calculate the area
        double area = 3.14 * rad *rad;

        System.out.println("Area of the Circle : " + area);

    }

}
