package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayPract1 {
    public static void main(String[] args) {

        int[] marks = {51 , 100 , 91 ,87 , 90, 91, 92};
        System.out.println(marks.length); //length always starts from 1
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        System.out.println(marks[7]); // gives exception i.e -- > ArrayIndexOutOfBoundsException
        System.out.println(marks[-1]); //gives exception i.e -- > ArrayIndexOutOfBoundsException




    }
}
