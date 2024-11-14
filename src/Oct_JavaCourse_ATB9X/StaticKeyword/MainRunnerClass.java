package Oct_JavaCourse_ATB9X.StaticKeyword;

public class MainRunnerClass {
    public static void main(String[] args) {

        System.out.println("Intial Count: " +StaticExample.count);

        //calling the static method

        StaticExample.increCount();
        System.out.println("Incremented Count: " + StaticExample.count);
    }
}
