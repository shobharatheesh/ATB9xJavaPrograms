package Oct_JavaCourse_ATB9X.Exception;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];  //length of the array is 5
            int result = 10 / 0;  //Arithmetic Exception
            arr[10] = 50; //ArrayIndexoutofboundException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundException: " +e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception : "+e.getMessage());
        } catch (Exception e)
        {
        System.out.println("General Exception: "+e.getMessage());
    }



    }
}
