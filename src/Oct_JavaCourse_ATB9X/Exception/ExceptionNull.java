package Oct_JavaCourse_ATB9X.Exception;

public class ExceptionNull {
    public static void main(String[] args) {

        System.out.println("Start");

        String str1 = null;
        str1.trim();   //NullPointerException

        String str = null;
        int num = Integer.parseInt(str);
        System.out.println(str);  //Connot pass null String

        System.out.println("End");


    }
}
