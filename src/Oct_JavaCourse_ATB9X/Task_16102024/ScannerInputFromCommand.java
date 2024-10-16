package Oct_JavaCourse_ATB9X.Task_16102024;

import java.util.Scanner;

public class ScannerInputFromCommand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println(age>=30 ? "He is the employee of the company" : " He is not the employee of the company");
        System.out.println("Enter the Salary : ");
        double Salary = scanner.nextDouble();
        System.out.println(Salary>=15000 ? "Shobha's Salary" : "not Shobha's salary");


    scanner.close();

    }


}
