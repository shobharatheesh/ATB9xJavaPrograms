package Oct_JavaCourse_ATB9X.ArrayList;

import java.util.ArrayList;

public class ConvertArrayListToArray {

    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        //Converting to array
        String[] colorsArray = colors.toArray(new String[0]);

        colors.toArray();


        //displaying an array
        System.out.println("Array:");
        for(String elements : colorsArray)
        {
            System.out.println(elements);
        }









    }
}
