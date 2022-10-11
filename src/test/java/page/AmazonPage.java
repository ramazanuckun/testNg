package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class AmazonPage {


   public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement aramaKutusu;
@FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
public WebElement aramaSonucElementi;
@FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement ilkUrun;
}
