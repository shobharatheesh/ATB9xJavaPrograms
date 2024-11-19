package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example4 {

    public static void main(String[] args) {

        //Using Finally Block

        try {
            int result = 10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
        finally {
            System.out.println("Finally Block always executed ..");
        }
        System.out.println("Program continues.....");
    }
}
