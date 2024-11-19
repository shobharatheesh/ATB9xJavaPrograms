package Oct_JavaCourse_ATB9X.Exception;

public class FinallyBlockExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result : " + result);
        }
        catch (ArithmeticException e)
        {
        System.out.println("Exception caught : "+e.getMessage());
    }
       finally {
        System.out.println("This is the finally block , always executed");
    }







    }
}
