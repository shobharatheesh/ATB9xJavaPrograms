package Oct_JavaCourse_ATB9X.SuperKeyword;

public class Vehicle {

   public int maxSpeed = 180;

   void display()
   {
       System.out.println("Parent");

   }

   Vehicle()
   {
       System.out.println("Default Constructor");
   }

   Vehicle(int a)
   {
       System.out.println("Parametierzed Constructor");
   }

   void message()   //Method or function
   {
       System.out.println("Hello Method");
   }

   void message( int a)   //Method Overloading
   {
       System.out.println(" Method Overloading ");
   }



}
