package Oct_JavaCourse_ATB9X.ex_23102024Function;

import java.util.Scanner;

public class FunctionMaxMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        //Performing the task

        System.out.println("Maximum number is : " + max(a ,b));

        sc.close();
    }

    public static int max(int a , int b){

        if(a >b) {
            return a;
        }
        else {
            return b;
        }


    }


    }

