package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input the values
        System.out.println("Enter the length : ");
        double len = sc.nextDouble();

        System.out.println("Enter the width : ");
        double wid = sc.nextDouble();

        double area = len * wid;

        System.out.println("Area of the rectangle is : " +area);

       sc.close();

    }

}
