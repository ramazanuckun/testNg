package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class FacebookFage {


    public FacebookFage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "email")
    public WebElement mailKutus;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement paswordKutusu;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginKutusu;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girilemediYazisi;
}
