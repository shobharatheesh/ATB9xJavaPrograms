package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 4, 1};

        //sorting the arrays
        Arrays.sort(numbers);

        //printing the sorted numbers
        System.out.println("Sorted array numbers: "+Arrays.toString(numbers));

        //searching for the element in the sorted array

        int index = Arrays.binarySearch(numbers, 5);

        //checking if element was found

        if(index>=0){
            System.out.println("Element found at index :" +index);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
