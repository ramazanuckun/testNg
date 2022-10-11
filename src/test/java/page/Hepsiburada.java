package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class Hepsiburada {
    public  Hepsiburada(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "(//*[text()='Elektronik'])[1]")
    public WebElement elektronik;
    @FindBy(xpath = "(//*[text()='Bilgisayar/Tablet])")
    public WebElement bilgisayar;
}
