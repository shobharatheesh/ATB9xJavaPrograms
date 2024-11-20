package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class CheckForAnElement {

    public static void main(String[] args)
    {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        //check if "cat" exists
        if(animals.contains("Cat"))
        {
            System.out.println("The List Contains Cat.");
        }
        else{

            System.out.println("The List does not contain Cat.");
        }
    }
}
