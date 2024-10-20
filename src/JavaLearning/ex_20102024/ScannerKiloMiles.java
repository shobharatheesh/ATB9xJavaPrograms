package JavaLearning.ex_20102024;

import java.util.Scanner;

public class ScannerKiloMiles {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        //input distance in kilometres

        System.out.println("Enter distance in Kilometres: ");
        double kilo = sc.nextDouble();

        //convert kilometres to miles

        Double miles = kilo * 0.621371;

        System.out.println("Distance in  Miles: " +miles);

        sc.close();
    }
}
