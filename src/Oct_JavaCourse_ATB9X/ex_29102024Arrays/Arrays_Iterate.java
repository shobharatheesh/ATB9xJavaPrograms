package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

import java.util.Arrays;

public class Arrays_Iterate {

    public static void main(String[] args) {

        int[] marks = {51 ,62, 82, 44, 25 };
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("------------");

        for(int i=0 ;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("-------------------");
        Arrays.sort(marks);
        System.out.println("Sorted marks : " +Arrays.toString(marks)); //Printing the sorted numbers

    }
}
