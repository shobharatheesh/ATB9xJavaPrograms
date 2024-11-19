package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example5 {
    public static void main(String[] args) {

        //Multiple catch block

        try{
            int result = 10/0;           ////ArithmeticException
            int[] arr = new int[3];
            arr[5] = 10;                 //ArrayIndexOutOfBoundsException

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException caught: "+e.getMessage());

        }
        catch(ArithmeticException e){

            System.out.println("Arithmetic caught: "+e.getMessage());
        }

        System.out.println("Program continues....");

    }
}
