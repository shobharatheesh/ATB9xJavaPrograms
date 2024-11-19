package Oct_JavaCourse_ATB9X.Exception_Part2;

public class ExceptionPractice {

    public static void main(String[] args) {

        int a = 0;
        int c =0;
         try
         {
             c= 10/a;
         }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception : " +e.getMessage());
        }
        System.out.println(c);
    }
}
