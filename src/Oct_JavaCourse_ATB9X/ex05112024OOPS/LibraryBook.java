package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class LibraryBook {

    //attributes

    String bookName;
    String author;
    int yearPublished;

    //constructor

    LibraryBook(String bookName , String author , int yearPublished )
    {
      this.bookName = bookName;
      this.author =author;
      this.yearPublished = yearPublished;
    }

    //behaviour

    void read()
    {
        System.out.println("This book " +bookName+ " is a very good story book for kids");
    }

   void bookInfo()
   {
    System.out.println("Name of the book : " +bookName);
    System.out.println("Author: "+author);
    System.out.println("Year of Publication: "+yearPublished);
   }

}
