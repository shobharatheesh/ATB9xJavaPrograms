package Oct_JavaCourse_ATB9X.ex_25102024String;

public class StringEquals2 {

    public static void main(String[] args) {

        String s1 ="Hello";  //SCP  String constant pool
        String s2 ="Hello";  //SCP
        String s3 ="Hello";  //SCP

        String s4 = new String("Rao");  //OA object area
        String s5 = new String("Rao");  //OA
        String s6 = new String("Rao");  //OA

        // ==  --> comparision --> gives true or false

        System.out.println(s1 == s6); //false
        System.out.println(s1 == s3); //true
        System.out.println(s4 == s5); //false

        //equalTo -- > checks whether the value is equal
        System.out.println(s1.equals(s6)); //false
        System.out.println(s1.equals(s3)); //false
        System.out.println(s4.equals(s5)); //false


    }
}
