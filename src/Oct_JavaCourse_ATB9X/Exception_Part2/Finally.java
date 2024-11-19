package Oct_JavaCourse_ATB9X.Exception_Part2;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();

        try
        {
            int b =10/a;
            System.out.println(b);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally {

            sc.close();
            System.out.println("Closing sc");
        }





    }
}
