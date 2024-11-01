package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayFunction1 {

    public static void main(String[] args) {

        int [] numbers = {3,5,7,2,8};

        System.out.println("Original array : ");
        //calling the function
        printArray(numbers);

    }

    public static void printArray(int[] numbers){

        for(int i =0 ; i < numbers.length;i++)
        {
            System.out.print(numbers[i] +" ");
        }
    }

}
