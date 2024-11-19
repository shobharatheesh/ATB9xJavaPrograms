package Oct_JavaCourse_ATB9X.Exception;

public class ConversionExample1 {
    public static void main(String[] args) {

        //convert int to string

        int num = 123;
        String str = String.valueOf(num);
        System.out.println("Converted int to string: "+str);

        //Another way to convert int to string
        String str1 = Integer.toString(num);
        System.out.println("Converted int to string: "+str1);


        //convert string to int

        String str2 = "456";
        int num2 = Integer.parseInt(str2);
        System.out.println("Converted string to int: "+num2);

        int num3 =Integer.valueOf(str2);
        System.out.println("Converted string to int: "+num3);

        //edge case

        String str3 = "abc";
        try{
            int num4 = Integer.parseInt(str3);
            System.out.println("This wont print cause the input is invalid");
        }
        catch(NumberFormatException e) {
            System.out.println("Cannot convert invalid string to int: "+e.getMessage());
        }

        //edge case

        String str4 = null;
        try {
            int num5 = Integer.parseInt(str4);
            System.out.println("This wont print since input is null ");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Cannot convert null to string: "+e.getMessage());
        }
    }
}
