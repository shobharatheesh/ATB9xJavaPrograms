package Learning.ex_02102024;

public class ReverseStringStringBuilder {

    public static void main(String[] args) {

        String input = "Hello";

        //using String builder to reverse string

        StringBuilder sb = new StringBuilder(input);

        String reversedString = sb.reverse().toString();

        System.out.println("Input String:" +input);

        System.out.println("Reversed String: " +reversedString);
    }
}
