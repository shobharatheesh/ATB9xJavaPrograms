package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayPract2 {
    public static void main(String[] args) {

        int[] marks = new int[5];
        //int[] marks = new int[-5]; //negative size gives exception ---> NegativeArraySizeException
        System.out.println(marks.length);

        marks[0]= 11;
        marks[1]= 12;
        marks[2] =13;
        marks[3] =14;
        marks[4]= 15;

        System.out.println(marks[4]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        // System.out.println(marks[-3]); //.ArrayIndexOutOfBoundsException




    }
}
