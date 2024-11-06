package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Product {

  //attributes
    String productName;
    double price;
    double quantity;
    int productId;

    //Constructor
    Product(String productName , double price , double quantity , int productId)
    {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId;
    }

    //behaviour

    void use ()
    {
        System.out.println("Product "+productName+ " is used for brushing the teeth");
    }

    void productDetails()
    {
        System.out.println("Product name: " +productName);
        System.out.println("Price: "+price + " rs");
        System.out.println("Quantity: " +quantity +" mg");
        System.out.println(("ProductID: "+productId));
    }
}
