package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example2 {

    public static void main(String[] args) {

        //Handling array index out of bounds

        int[] arr = {1,2,3};

        try
        {
            System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }

        System.out.println("Program continues");
    }
}
