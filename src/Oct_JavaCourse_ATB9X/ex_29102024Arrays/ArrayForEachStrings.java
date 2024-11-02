package Oct_JavaCourse_ATB9X.ex_29102024Arrays;

public class ArrayForEachStrings {

    public static void main(String[] args) {

        String[] names = {"shobha", "ratheesh" , "diya" , "nidhi"};

        for(String element : names)
        {
            System.out.println(element);
        }
        System.out.println("---------------");
       for(String n : names)
       {
           System.out.println(n);
       }
        System.out.println("-------------------");

       int[] numbers = {1,2,3};

       for(int element : numbers){
           System.out.println(element);
       }

    }
}
