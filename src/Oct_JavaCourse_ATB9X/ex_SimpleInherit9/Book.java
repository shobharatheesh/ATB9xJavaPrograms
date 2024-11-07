package Oct_JavaCourse_ATB9X.ex_SimpleInherit9;

public class Book extends Library{

    String bookTitle;   //attributes
    String author;

    public Book(String bookTitle,String author) //parameterized constructor
    {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public void displayInfoBooks()   //behaviour
    {
        displayLibraryName();
        System.out.println("Book Title : " +bookTitle+", Author: "+author);

    }
}
