package Oct_JavaCourse_ATB9X.ex_17102024_ifElse;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score = sc.nextInt();

        char grade = 'F';

        if(score>=90 && score <=100)
        {
            grade = 'A';
        }
        else if (score >=80 && score<=89)
        {
            grade = 'B';
        }
        else if (score >= 70 && score <= 79)
        {
            grade = 'C';
        }
        else if (score >= 60 && score <= 69) {
            grade = 'D';
        }
        else if(score<= 0 || score >=100)
        {
            System.out.println("LOL , are you God?");
        }
        else{
            grade ='F';

        }
        System.out.println("your grade is : "+grade);
    }
}
