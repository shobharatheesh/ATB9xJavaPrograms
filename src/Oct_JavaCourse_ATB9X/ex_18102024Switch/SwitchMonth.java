package Oct_JavaCourse_ATB9X.ex_18102024Switch;

import java.util.Scanner;

public class SwitchMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //input the month number
        System.out.println("Enter the number between 1 and 12: ");
        int month = sc.nextInt();

        //use switch statement to print the corresponding month
        switch(month){

            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid input ! Please enter the number between 1 and 12");
        }


    sc.close();

    }
}
