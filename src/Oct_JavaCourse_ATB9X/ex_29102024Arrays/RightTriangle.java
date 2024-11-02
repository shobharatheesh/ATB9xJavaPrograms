package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class RightTriangle {

    public static void main(String[] args) {
        int n = 5; // height of the triangle

        // Loop to print each row
        for (int i = 1; i <= n; i++) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
