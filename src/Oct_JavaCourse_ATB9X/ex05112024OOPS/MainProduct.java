package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainProduct {
    public static void main(String[] args) {

        Product p = new Product("Sensodyne Toothpaste",150, 200 , 234);
        Product p1 = new Product("Paradontax Toothpaste", 120 , 200 , 345);

        p.use();
        p.productDetails();

        System.out.println("-------------------");

        p1.use();
        p1.productDetails();

    }

}
