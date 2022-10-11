package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

public class HotelmyCamp {

    public HotelmyCamp() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userName;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement pasworld;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginOnay;
    @FindBy(xpath = "//body[@class='page-md page-header-fixed page-quick-sidebar-over-content']")
    public WebElement icindeBulunulan;
    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girilemediYazisi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagent;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement hotelManagentReverSeion;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement hotelManagentReverSeionAddRoom;
    @FindBy(xpath = "//select[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement roomreversionText;

    @FindBy(xpath = "//*[text()='OK']")
    public WebElement okButton;

}
