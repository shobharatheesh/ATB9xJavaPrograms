package Oct_JavaCourse_ATB9X.Exception;

public class ExceptionExample {

    public static void main(String[] args)
    {

        System.out.println("Start of the Program");


        String num = "10";
        //converting String to Wrapper and then to int (Primitive)
        Integer c = Integer.valueOf(num);

        String ip = args[0];
        int a = Integer.parseInt(ip);  //converting string to primitive integer

        int b = 1000/a;
        int d = 1000/c;
        System.out.println(b);
        System.out.println(c);

        System.out.println("End of the Program");







    }
}
