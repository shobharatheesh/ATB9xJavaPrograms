package Oct_JavaCourse_ATB9X.Exception;

public class TryCatchExample {


    public static void main(String[] args){

        try
        {
            int result = 10/0; //division by zero
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception caught :" +e.getMessage());
        }
    }
}
