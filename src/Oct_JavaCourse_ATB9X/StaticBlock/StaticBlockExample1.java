package Oct_JavaCourse_ATB9X.StaticBlock;

public class StaticBlockExample1 {

    // static variable
      static int number;

      //static block to initialize static variables

    static {

        number =10;
        System.out.println("Static block executed, number set to " +number);
    }


}
