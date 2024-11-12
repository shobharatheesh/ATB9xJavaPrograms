package Oct_JavaCourse_ATB9X.Encapsulation;

public class MainRunnerClass {

    public static void main(String[] args) {

        EncapExample en = new EncapExample();

        en.setName("Shobha");  //setting the name using seter

        System.out.println("Name :" + en.getName()); //accessing the name using getter
    }
}
