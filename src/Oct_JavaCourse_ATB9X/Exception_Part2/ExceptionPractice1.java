package Oct_JavaCourse_ATB9X.Exception_Part2;

public class ExceptionPractice1 {

    public static void main(String[] args) {

        int a =0;
        int c =0;

        try {
            String s1 = null;
            s1.trim();
            c = 10 / a;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
