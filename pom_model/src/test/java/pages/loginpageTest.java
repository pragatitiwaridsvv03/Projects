package pages;

import baseclass.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginpageTest extends BaseClass
{
    loginpage obj;
    public loginpageTest()
    {
        super();
    }


    @BeforeClass
    void  init()
    {
        obj = new  loginpage(driver);
        System.out.println("Hello");
    }

    @Test
    void login() throws InterruptedException
    {
       obj.loginPerform();
       obj.signupPerform();
    }
}
