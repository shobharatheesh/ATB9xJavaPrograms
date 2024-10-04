package Learning.ex_02102024;

public class ReverseStringForLoop {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = "";

        //Iterating over the string in reverse order

        for(int i = input.length()-1; i>=0; i--){

            reversed += input.charAt(i);

        }

        System.out.println("Input String:" +input);

        System.out.println("Reversed String:" +reversed);
    }
}
