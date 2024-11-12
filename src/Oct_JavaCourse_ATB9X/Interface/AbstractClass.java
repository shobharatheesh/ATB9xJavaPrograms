package Oct_JavaCourse_ATB9X.Interface;

abstract class AbstractClass {

    AbstractClass()    //default constructor
    {
        System.out.println("Default constructor");
    }

    abstract  void m1();      //Abstract method

    void m2 ()                //method or function
    {
        System.out.println("Complete Method");
    }

    interface I
    {
        void m1();
        void m2();

//        void m3()
//        {
//            System.out.println( "interface abstract methods cannot have body");
//        }

        default void m4()           //default and static method can hold in interface
        {
            System.out.println("Default Method");
        }

        default void m5()
        {
            System.out.println("Default Method in interface");
        }

        static void m6()
        {
            System.out.println("Static method in interface");
        }
    }


}
