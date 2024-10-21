package OctJavaLearning2024.ex_08102024;

public class MainMethod {

    public static void main(String[] args)
    {

        System.out.println("Hello World!");

        //accessing command line arguments

       if(args.length>0){

            System.out.println("Arguments Passed:");

            for(String arg :args)
            {
                System.out.println(arg);
            }
        }
    }
}
