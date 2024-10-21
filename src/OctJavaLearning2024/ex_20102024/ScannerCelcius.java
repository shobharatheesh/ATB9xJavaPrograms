package OctJavaLearning2024.ex_20102024;

import java.util.Scanner;

public class ScannerCelcius {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input temperature in Celsius

        System.out.println("Enter the Temperature in Celsius: ");

        double celsius = sc.nextDouble();

        double fahrenhiet = ( celsius * 9/5) + 32;

        System.out.println("Temeperature in Farenheit is: " + fahrenhiet);

        sc.close();

    }

}
