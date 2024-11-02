package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayException {

    public static void main(String[] args) {

        int[] a2 = new int[5];
        //int a3[] =new int[-2]; //NegativeArraySizeException
        a2[0] = 1;
        a2[1] = 2;
        a2[2] = 3;
        a2[3] = 4;
        a2[4] = 5;

        System.out.println(a2[0]);
        System.out.println(a2[1]);
        System.out.println(a2[2]);
        System.out.println(a2[3]);
        System.out.println(a2[4]);




    }
}
