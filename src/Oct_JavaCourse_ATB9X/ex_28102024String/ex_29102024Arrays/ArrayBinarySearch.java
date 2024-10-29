package Oct_JavaCourse_ATB9X.ex_28102024String.ex_29102024Arrays;

import java.util.Arrays;

public class ArrayBinarySearch {

    public static void main(String[] args) {
        int[] numbers ={1, 2, 4, 5, 8};

        //searching for the element in the sorted array

        int index = Arrays.binarySearch(numbers, 8);

        //checking if element was found

        if(index>=0){
            System.out.println("Element found at index :" +index);
        }
        else {
            System.out.println("Element not found");
        }



    }
}
