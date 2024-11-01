package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctionPractice {
    public static void main(String[] args) {

        // Printing array numbers

        int[] numbers ={3,5,7,2,8};

        System.out.println("Original Array: ");
        printArray(numbers);

    }

    public static void printArray(int[] numbers)
    {
        for(int element : numbers)
        {
           System.out.print(element + " ");

        }
        System.out.println();

    }
}
