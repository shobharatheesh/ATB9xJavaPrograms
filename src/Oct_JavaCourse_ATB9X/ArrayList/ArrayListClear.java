package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListClear {
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Pen");
        arr.add("Notebook");
        arr.add("Eraser");

        System.out.println("Original List: "+arr);

        //clearing the ArrayList
        arr.clear();

        System.out.println("After clearing: "+arr);







    }
}
