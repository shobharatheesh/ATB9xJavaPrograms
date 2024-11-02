package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctionPractice3 {

    public static void main(String[] args) {

        //find min using for each loop

        int[] numbers = {3, 5, 7, 2, 8};

        //calling functions

        System.out.println("Minimum number : "+findMin(numbers));
    }

    public static int findMin(int[] numbers) {

        int min = numbers[0];

        for(int element: numbers){

            if(element < min){

             min = element;
            }

        }
       return min;
    }
}
