package Oct_JavaCourse_ATB9X.Exception;

public class ConversionExample {

    public static void main(String[] args) {

        //convert int to String

        int num =  123;
        String str = String.valueOf(num);
        System.out.println("Converted int to String: "+str);

        //Convert String to int

        String str1 = "456";
        int num1 = Integer.parseInt(str1);
        System.out.println("Converted String to Int: "+num1);

    }


}
