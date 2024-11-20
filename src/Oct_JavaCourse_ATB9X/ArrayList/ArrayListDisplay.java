package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListDisplay {

    public static void main(String[] args)
    {

        //creating an ArrayList

        ArrayList<String> fruits = new ArrayList<>();

        //adding elements

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        //Displaying the ArrayList
        System.out.println("Size of the Array: "+ fruits.size());    //size
        System.out.println("Elements in the Array: "+fruits.get(0)); //elements in each index
        System.out.println("Elements in the Array: "+fruits.get(1));
        System.out.println("Elements in the Array: "+fruits.get(2));
        System.out.println("Elements in the Array: "+fruits);       //elements in the array












    }
}
