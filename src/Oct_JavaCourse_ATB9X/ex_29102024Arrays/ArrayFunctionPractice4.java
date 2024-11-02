package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunctionPractice4 {

    public static void main(String[] args) {

        //reverse numbers using for each loop

        int[] numbers = {3, 5, 7, 2, 8};

        //calling functions
        System.out.println("Reversal number : ");
        reversNumbers(numbers);

        for(int i =0 ;i < 5 ; i++){

            System.out.println(numbers[i]);
        }



    }

    public static void reversNumbers(int[] numbers) {

        int start =0;
        int end = numbers.length -1;

          while(start <end)
        {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }
}
