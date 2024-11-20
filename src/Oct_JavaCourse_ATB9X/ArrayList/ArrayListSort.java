package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(50);
        num.add(20);
        num.add(40);
        num.add(10);

        System.out.println("Original List : "+num);

        //Reverse the list
        Collections.reverse(num);
        System.out.println("Reverse order list : "+num);


        //Sorting the list
        Collections.sort(num);
        System.out.println("Sorted list: "+num);

        //descending order list
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Sorted in decending order: "+num);






    }
}
