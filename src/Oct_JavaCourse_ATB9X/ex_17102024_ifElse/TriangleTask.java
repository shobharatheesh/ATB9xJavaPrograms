package Oct_JavaCourse_ATB9X.ex_17102024_ifElse;

import java.util.Scanner;

public class TriangleTask {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1 : ");
        int a = sc.nextInt();
        System.out.println("Enter the side2: ");
        int b = sc.nextInt();
        System.out.println("Enter the side3: ");
        int c  = sc.nextInt();

        if(a==b && b==c && c==a){

            System.out.println("The Triangle is Equilateral triangle");
        }
        else if (a==b || a==c || b==c ) {
            System.out.println("The Traingle is Isoceles triangle ");

        }

        else {

            System.out.println("The Triangle is Scalene triangle");
        }
    }
}
