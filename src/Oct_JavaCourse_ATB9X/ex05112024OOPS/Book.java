package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Book {

    //attributes

    String title;
    String author;
    double price;

    //constructor
    Book(String title , String author , double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    //behaviour
    void read()
    {
        System.out.println("This book " + title +" is for reading ");
    }

    void displayInfo()
    {
        System.out.println("Title :" + title);
        System.out.println("Author : " + author);
        System.out.println("Price :"+price);
    }

}
