package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ArrayListExample {

    //create and display arraylist
    public static void main(String[] args)
    {
        //create a array list of strings

        ArrayList<String> names = new ArrayList<>();

        //add elements to arraylist

        names.add("Shobha");
        names.add("Ratheesh");
        names.add("Diya");
        names.add("Nidhi");

        //display elements of the ArrayList

        System.out.println("Names in the ArrayList  : " +names);

        System.out.println("Names in the ArrayList : ");

        for( String arr:names)
        {
            System.out.println(arr);
        }
    }
}
