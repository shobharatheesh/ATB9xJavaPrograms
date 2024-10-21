package JavaLearning.ex_21102024ForLoop;

import java.util.Scanner;

public class ForLoopNaturalNum
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Natural numbers are: ");

        for(int i=1;i<=num;i++) {
            System.out.println(i);

        }
    }
}
