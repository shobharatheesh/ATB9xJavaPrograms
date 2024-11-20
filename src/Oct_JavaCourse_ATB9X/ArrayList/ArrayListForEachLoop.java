package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListForEachLoop {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("New York");
        arr.add("London");
        arr.add("Tokyo");
        arr.add("India");
        arr.add("Korea");

        System.out.println("Size of the array: "+arr.size());

        //using for each loop

        System.out.println("Using for each loop: ");
        for(String str : arr)
        {
            System.out.println(str);
        }

        System.out.println("ArrayList Elements : " +arr);
    }
}
