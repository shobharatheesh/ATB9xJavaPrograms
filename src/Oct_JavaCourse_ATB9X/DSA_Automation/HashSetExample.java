package Oct_JavaCourse_ATB9X.DSA_Automation;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args)
    {

        //create a Hashset

        HashSet<String> set = new HashSet<>();

        //add elements

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Banana"); //duplicate will not be added

        //Display hashset
        System.out.println("Display Hashset: " +set);

        //check if the element exists
        System.out.println("Contains Apple: "+set.contains("Apple"));

        // remove an element
        set.remove("Banana");
        System.out.println("After removing : "+set);

        //Iterate through Hashset

        System.out.println("Iterating through Hashset: ");
        for(String s : set)
        {
            System.out.println(s);
        }










    }
}
