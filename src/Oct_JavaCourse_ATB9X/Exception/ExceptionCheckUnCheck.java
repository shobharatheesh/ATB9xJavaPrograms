package Oct_JavaCourse_ATB9X.Exception;

public class ExceptionCheckUnCheck {
    public static void main(String[] args) {

        //checked
        // FileReader file = new FileReader("C://shobha"); //FileNotFoundException during complie time

        //unchecked
        int a = 10;
        int b =0;
        int c = a/b;  //Arithmetic exception during runtime
        System.out.println(c);




    }
}
