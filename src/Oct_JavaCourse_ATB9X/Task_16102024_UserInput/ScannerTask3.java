package Oct_JavaCourse_ATB9X.Task_16102024_UserInput;

import java.util.Scanner;

public class ScannerTask3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //creating a instance of Scanner class and Taking user input

        System.out.println("Enter the name: ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter the Salary: ");
        double salary = sc.nextDouble();

        //Printing the user input
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);

       sc.close();

    }
}
