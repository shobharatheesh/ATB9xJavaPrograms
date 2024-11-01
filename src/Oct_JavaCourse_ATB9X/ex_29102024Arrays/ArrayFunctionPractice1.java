package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctionPractice1 {

    public static void main(String[] args) {

        //printing the sum of array numbers

        int[] numbers = {3, 5, 7, 2, 8};

        System.out.println(sumArray(numbers));


    }

    public static int sumArray(int[] numbers) {

        int sum = 0;

        for (int element : numbers) {

        sum = sum + element;
    }
  return sum;

    }

    }


