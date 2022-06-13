package pages;

import baseclass.BaseClass;
import helper.ActionHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BaseClass{

    WebDriver driver;
    By logo = By.xpath("//*[@id=\"_desktop_logo\"]//a");

    @FindBy(xpath = "//a[@title=\"Log in to your customer account\"]")
    private WebElement login;

    public Homepage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void homepagePerform() throws InterruptedException
    {
        Thread.sleep(10000);
        ActionHandler.click(login);
    }

}
