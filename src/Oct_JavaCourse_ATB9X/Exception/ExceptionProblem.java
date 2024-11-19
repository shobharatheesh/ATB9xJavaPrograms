package Oct_JavaCourse_ATB9X.Exception;

public class ExceptionProblem {
    public static void main(String[] args) {

        System.out.println("Start of the program");

        String ip = args[0]; //ArrayIndexoutofboundException
       // System.out.println(ip);

        int a = Integer.parseInt(ip);
        int b =1000/a;

        System.out.println(b);
        System.out.println("End of the program");



    }
}
