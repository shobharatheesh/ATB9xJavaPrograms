package Oct_JavaCourse_ATB9X.Exception_Part2;

public class Exception_Example3 {

    public static void main(String[] args) {

        //Null pointer exception

        String str = null;

       try {
           System.out.println(str.length());//throw NullPointerException
       }
       catch(NullPointerException e)
       {
           System.out.println(e.getMessage());
       }
        System.out.println("Program Continues .....");
    }
}
