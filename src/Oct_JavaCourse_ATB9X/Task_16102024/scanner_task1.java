package Oct_JavaCourse_ATB9X.Task_16102024;

import java.util.Scanner;

public class scanner_task1 {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = sc.next();

        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: "+salary);



    }
}
