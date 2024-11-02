package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctionPractice2 {
    public static void main(String[] args) {

        //find max numbers using for each loop

        int[] numbers = {3, 5, 7, 2, 8};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        //calling the function

        System.out.println("Maximun number : " + findMax(numbers));


    }

    public static int findMax(int[] numbers) {

        int max = numbers[0];

        for(int element : numbers){

            if(element > max)
            {
                max = element;
            }
        }
        return max;

    }



}
