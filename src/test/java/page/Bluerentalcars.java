package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class Bluerentalcars {


    public Bluerentalcars(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailButton;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement paswordButton;
    @FindBy(xpath = "(//*[.=' Login'])[5]")
    public WebElement emailPaswordOnay;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement anaSayfa;
    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement ikinciLogin;

}
