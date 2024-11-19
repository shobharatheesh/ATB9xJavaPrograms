package Oct_JavaCourse_ATB9X.Exception;

public class Exception_Handle2 {
    public static void main(String[] args) {

        System.out.println("Start of the Program");

        int c=0;
        int b =0;

        try{
            b= 10/c; //Arithmetic exception
            System.out.println(b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception  Message : " +e.getMessage());
        }

        finally {

            System.out.println("End of the program");

        }

    }
}
