package Oct_JavaCourse_ATB9X.Exception;

public class FinallyNotExecuted {

    public static void main(String[] args)
    {

        try{
            int a = 10/10;
            System.exit(0);  //JVM will exit here so no futher code will be exceuted
        }
        catch(Exception e)
        {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Not Printed");
        }





    }
}
