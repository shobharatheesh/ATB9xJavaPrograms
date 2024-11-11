package Oct_JavaCourse_ATB9X.RealExerciseOOPS;

public class TestCase1 extends BaseClass{

    public TestCase1()
    {
        super();
        System.out.println("DC -TC1");
    }

    public void startTestcase()
    {
        openBrowser("Chrome");
        closeBrowser();
    }


    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("Own Logic");
        super.setBrowser(browser, isAuth);
    }

    @Override
    public String toString() {
        return "TestCase1{}";
    }

}
