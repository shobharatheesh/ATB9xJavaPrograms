package Oct_JavaCourse_ATB9X.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListInputs {

    public static void main(String[] args)
    {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        names.add(name);

        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        ages.add(age);

        sc.nextLine();

        System.out.println("Do you want to enter another record (Y/N): ");
        continueInput = scanner.nextLine();
    }
}
