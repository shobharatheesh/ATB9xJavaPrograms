package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListAddRemove1 {

    public static void main(String[] args)
    {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);

        System.out.println("Length: " +num.size());
        System.out.println("Original List: "+num);

        //Adding an element at index 1

        num.add(1,15);
        System.out.println("After Adding 15 to index 1: "+num);

        //Removing an element at index 2
        num.remove(2);
        System.out.println("After removing the number at index 2: "+num);

        //removing an element by value
        num.remove(Integer.valueOf(15));
        System.out.println("After removing 15 by value: "+num);







    }
}
