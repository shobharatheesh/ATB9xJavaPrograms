package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerSimpleInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input the values

        System.out.println("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time: ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) /100;

        System.out.println("The Simple Interest is : "+si);

        sc.close();
    }
}
