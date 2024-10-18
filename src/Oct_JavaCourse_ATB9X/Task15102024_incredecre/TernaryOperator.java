package Oct_JavaCourse_ATB9X.Task15102024_incredecre;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10 , b = 20 , c = 15;

        //Ternary operator to find the largest of three number

        int largest = (a > b) ? (a > c ? a : c) : (b >c ? b : c );

        System.out.println("The largest number is : " +largest);

    }
}
