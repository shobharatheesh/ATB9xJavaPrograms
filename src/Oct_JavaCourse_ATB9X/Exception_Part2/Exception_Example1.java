package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example1 {

    //Handling division by zero

    public static void main(String[] args) {

        try
        {
            int result = 10/0;

        }
        catch(Exception e)
        {
            System.out.println("Exception caught: "+e.getMessage());
        }
        System.out.println("Programs continues");


    }
}
