package Oct_JavaCourse_ATB9X.Exception_Part2;

public class FinallyKeyword {

    public static void main(String[] args) {

        int a =1;
        int c= 0;

        try
        {
            c =10/a;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This bloxk will be executed");
        }

    }
}
