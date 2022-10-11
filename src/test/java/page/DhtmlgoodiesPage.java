package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class DhtmlgoodiesPage {

  public   DhtmlgoodiesPage(){

      PageFactory.initElements(Driver.getDriver(),this);
      //olusturacagim consracterla web elementlerimi ilskilendoryorum

    }
    @FindBy(xpath = "//div[@id='box1']")
   public WebElement oslo;//neden puplic ben butun frame workumde halka actim
    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stocholm;
    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;
    @FindBy(xpath = "//div[@id='box4']")
    public WebElement kopenhang;
    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seol;
    @FindBy(xpath = "//div[@id='box6']")
    public WebElement rome;
    @FindBy(xpath ="//div[@id='box7']" )
     public WebElement madrid;
//countries
    @FindBy(xpath = "//div[@id='box106']")
    public WebElement italy;
    @FindBy(xpath = "//div[@id='box107']")
    public WebElement spain;
    @FindBy(xpath = "//div[@id='box101']")
    public WebElement Norvay;
    @FindBy(xpath = "//div[@id='box104']")
    public WebElement Denmark;
    @FindBy(xpath = "//div[@id='box105']")
    public WebElement SouthKorea;
    @FindBy(xpath ="//div[@id='box102']" )
    public WebElement Sweden;
    @FindBy(xpath ="//div[@id='box103']" )
    public WebElement UnitedStates;
}
