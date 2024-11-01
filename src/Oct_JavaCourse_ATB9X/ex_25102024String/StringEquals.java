package Oct_JavaCourse_ATB9X.ex_25102024String;

public class StringEquals {

    public static void main(String[] args) {

        String s1 ="Hello";  //SCP  String constant pool
        String s2 ="Hello";  //SCP
        String s3 ="Hello";  //SCP

        String s4 = new String("Rao");  //OA object area
        String s5 = new String("Rao");  //OA
        String s6 = new String("Rao");  //OA

        System.out.println(s1);
        System.out.println(s6);

    }
}
