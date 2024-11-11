package Oct_JavaCourse_ATB9X.RealExerciseOOPS;

public class BaseClass {

    //attributes
    private String browser;  //instance variable


    //default constructor
    BaseClass(){
        System.out.println("DC - BaseClass");
    }

    //Parametreized constructor

    BaseClass(String b){
        System.out.println("CC - BaseClass");
    }


    //encapsulating instance variable using get and set methods
    public String getBrowser() {
        return browser;
    }

    //Methods for the Baseclass
    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    //Methods for class  BaseClass
    void openBrowser() {
        System.out.println("Opening Browser!!");

//        Webdriver driver = new ChromeDriver();  //dynamic dispatch
//        driver.get("url");
    }

    //Method overloading openBrowser() with arguments
    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }








}
