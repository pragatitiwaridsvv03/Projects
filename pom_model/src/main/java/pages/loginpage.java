package pages;

import baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class loginpage extends BaseClass
{
    @FindBy(name = "email")
    private WebElement email;

    @FindBy(xpath = "//input[@type=\"password\"]")
    private WebElement password;

    @FindBy(id = "submit-login")
    private WebElement loginBtn;

    public  loginpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void loginPerform() throws InterruptedException
    {
        email.clear();
        email.sendKeys(super.pros.getProperty("userName"));
        password.sendKeys(super.pros.getProperty("password"));
        loginBtn.click();
    }

    @FindBy(className = "no-account")
    private WebElement signup;

    @FindBy(xpath = "//input[@name=\"id_gender\" and @value=\"1\"]")
    private WebElement gender;

    @FindBy(name = "firstname")
    private WebElement firstname;

    @FindBy(name = "lastname")
    private WebElement lastname;

    @FindBy(name = "email")
    private WebElement Email;

    @FindBy(name = "password")
    private WebElement Password;

    @FindBy(xpath = "//button[@class=\"btn btn-primary form-control-submit float-xs-right\"]")
    private WebElement submit;

    @FindBy(xpath = "//input[@name=\"psgdpr\" and @value=\"1\"]")
    private WebElement click;

    @FindBy(xpath = "//button[@class=\"btn btn-primary form-control-submit float-xs-right\"]")
    private WebElement save;

    public void signupPerform() throws InterruptedException
    {
        signup.click();
        gender.click();
        firstname.sendKeys(super.pros.getProperty("firstname"));
        lastname.sendKeys(super.pros.getProperty("lastname"));
        Email.sendKeys(super.pros.getProperty("Email"));
        Password.sendKeys(super.pros.getProperty("Password"));
        click.click();
        save.click();

        Thread.sleep(10000);
    }

}
