package Oct_JavaCourse_ATB9X.ex_18102024Switch;

import java.util.Scanner;

public class UnitConvertor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Operation : ");
        System.out.println("1.Convertion from Kilometer to Miles");
        System.out.println("2.Convertion from Miles to Kilometer");
        System.out.println("3.Convertion from Celsius to Fahrenheit");
        System.out.println("4.Convertion from Fahrenheit to Celsius");

        int op = sc.nextInt();

        switch(op)
        {
            case 1:
                //Kilometers to miles
                System.out.println("Enter the distance in  Kilometers:");
                double kilo = sc.nextDouble();
                double miles = kilo * 1000;
                System.out.println("Converting Kilometers to Miles is: " +miles);
                break;

            case 2:
                //Miles to Kilometers
                System.out.println("Enter the distance in  Miles: ");
                miles = sc.nextDouble();
                kilo = miles / 1000;
                System.out.println("Converting Miles to Kilometers is: " +kilo);
                break;

            case 3:
                //celsius to Fahrenheit
                System.out.println("Enter the Temperature in Celsius: ");
                double cel =sc.nextDouble();
                double fahrenheit = ( cel * (9/5) )+ 32;
                System.out.println("Converting Celcius to Fahrenheit: " +fahrenheit);
                break;

            case 4:
                //Fahrenheit to celsius
                System.out.println("Enter the Temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                cel = (fahrenheit -32) * 5/9;
                System.out.println("Converting Fahrenheit to Celsius :" +cel);
                break;

            default:
                System.out.println("Invalid Temperature");


        }

        sc.close();

        }



    }

