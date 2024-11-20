package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListIterate {

    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("New York");
        arr.add("London");
        arr.add("Tokyo");

        System.out.println(arr.size());

        //using a for loop
        for(int i =0 ; i<arr.size(); i++)
        {
            System.out.println("ArrayList elements :" +arr.get(i));

        }
        System.out.println("ArrayList :" +arr);









    }
}
