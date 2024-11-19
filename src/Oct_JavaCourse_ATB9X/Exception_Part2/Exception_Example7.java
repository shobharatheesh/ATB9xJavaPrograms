package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example7 {

    public static void main(String[] args) {

        //Catching general exceptions

        int[] arr = new int[3];
        try{
            System.out.println(arr[5]);  //ArrayIndexOutOfBoundsException
        }
        catch(Exception e)
        {
            System.out.println("General exception: "+e.getMessage());
        }
        System.out.println("Program continues ....");
    }
}
