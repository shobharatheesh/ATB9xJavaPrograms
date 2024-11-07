package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListContains {

    public static void main(String[] args) {

        //create an array list of strings

        ArrayList<String>arr = new ArrayList<>();

        //add elements to the Arraylist

        arr.add("Shobha");
        arr.add("Ratheesh");
        arr.add("Diya");
        arr.add("Nidhi");

        System.out.println("Names in the Array List : " +arr);

        //check of Ratheesh exists

        if(arr.contains("Ratheesh"))
        {
            System.out.println("Ratheesh exists");
        }
        else{

            System.out.println("Ratheesh not present in the list");
        }



    }
}
