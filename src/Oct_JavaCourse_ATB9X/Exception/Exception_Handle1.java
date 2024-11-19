package Oct_JavaCourse_ATB9X.Exception;

public class Exception_Handle1 {

    public static void main(String[] args) {

        System.out.println("Start");

        String str1 = null;
        try {
            str1.trim();   //NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        System.out.println("End");
    }
}
