package pages;

import baseclass.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomepageTest extends BaseClass {
    Homepage obj;
    public HomepageTest()
    {
        super();
    }

    @BeforeClass
    void  init()
    {
        obj = new Homepage(driver);
        System.out.println("Hello");
    }

    @Test
    void login() throws InterruptedException
    {
        obj.homepagePerform();
    }
}
