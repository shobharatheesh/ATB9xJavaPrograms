package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayForEach {

    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

      //  for(int i=0; i<3; i++)   //using " for loop " printing the array numbers
      //  {
      //      System.out.println(a[i]);
       // }

        for(int element : a) // using "for each loop "--> element in array a
        {
            System.out.println(element);
        }
    }
}
