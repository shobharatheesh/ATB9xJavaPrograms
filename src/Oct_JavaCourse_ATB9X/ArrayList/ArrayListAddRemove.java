package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListAddRemove {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        System.out.println("Original numbers : "+numbers);

        numbers.remove(2);

        System.out.println("Updated Array : "+numbers);




    }
}
