package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortIntegers {

    public static void main ( String[] args){

        //create an arraylist of integers

           ArrayList<Integer> numbers = new ArrayList<>();

           //add elements to the arayList


        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(20);

        //sort the arraylist
        Collections.sort(numbers);

        System.out.println("Sorting the numbers: "+numbers);





    }
}
