package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListEmpty {

    public static void main(String[] args)
    {

        ArrayList<Integer> numbers = new ArrayList<>();

        //checking if array is empty
        if(numbers.isEmpty())
        {
            System.out.println("The ArrayList is Empty");
        }
        else {
            System.out.println("The ArrayList is not empty");
        }

        //adding an element and checking again

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("ArrayList is now not empty: "+numbers);




    }
}
