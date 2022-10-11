package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class Sauedemo {

    public Sauedemo(){

      //  PageFactory.initElements(Driver.getDriver(), this);

    PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement pasword;
    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement click;
    @FindBy(xpath = "//select[@class='product_sort_container']")
    public WebElement ddmMenu;
    @FindBy(xpath = "(//*[text()=\"Price (low to high)\"])[1]")
    public WebElement secilen;
}