package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListSize {

    public static void main(String[] args) {

        //Create an arraylist of strings

           ArrayList<String> animals = new ArrayList<>();

           //add elements to the array list
        animals.add("cat");
        animals.add("dog");
        animals.add("Elephant");

        //get the size of arrayList

        System.out.println("Size of arrayList : "+animals.size());


    }
}
