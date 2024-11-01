package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctions {
    public static void main(String args[]){

        int[] numbers = {3, 5, 7, 2, 8};

        //using index printing the array numbers

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println("Length of the numbers : " +numbers.length);

        //using for loop printing the array numbers
        System.out.println("Array Numbers are :");

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] +" ");
        }
    }
}
