package Oct_JavaCourse_ATB9X.ex_17102024_ifElse;

import java.util.Scanner;

public class GradeMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the marks: ");
        int marks = scanner.nextInt();

        if (marks>90)
        {
            System.out.println("Congrats!! Your Grade is A");
        }

        else if (marks>=80 && marks<=89) {

            System.out.println("Congrats!! your Grade is B");

        }
        else if(marks>=70 && marks<=79)
        {

            System.out.println("Congrats!! your grade is C");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("Congrats!! Your grade is D");
        }
        else{

            System.out.println("Failed , your grade is E");
        }

    }
}
