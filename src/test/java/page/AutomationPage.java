package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

import java.util.List;

public class AutomationPage {

    public AutomationPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//section[@id='slider']")
    public WebElement AutomatinGorunurlugu;

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement buttonClick;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement hesabaGirisGorunurlugu;
    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement girisEmail;
    @FindBy(xpath = "(//input[@type='password'])[1]")

    public WebElement girisPasword;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement girisLogin;
    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement userNameGorunurlugu;
    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteHesap;
    @FindBy(xpath = "//div[@class='page-header']")
    public WebElement silindiGorunurlugu;
    @FindBy(xpath = "//*[text()='Your email or password is incorrect!']")
    public WebElement YanlisGirisGorunurlugu;
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement logoutButton;
    @FindBy(xpath = "//section[@id='form']")
    public WebElement basaDondumu;
    @FindBy(xpath = "//input[@type='text']")
    public WebElement yeniKullaniciName;
    @FindBy(xpath = "(//input[@type='email'])[2]")
    public WebElement yeniKullaniciEmail;
    @FindBy(xpath = "//*[text()='Email Address already exist!']")
    public WebElement yeniKullaniciEmailKayitliKayitBasarisiz;

    @FindBy(xpath = "//i[@class='fa fa-envelope']")
    public WebElement bizeUlasin;
    @FindBy(xpath = "(//h2[@class='title text-center'])[1]")
    public WebElement bizeUlasinGorunurlugu;
    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement bizeUlasinName;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement bizeUlasinDosyaYuke;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement bizeUlasinbitti;

    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement bizeUlasinbittiMesajyazisi;

    @FindBy(xpath = "//span/i")
    public WebElement bizeUlasinbittiMesajyazisiBitiHomeDon;

    //@FindBy(xpath = "//a[@class='btn btn-success']")
    //  public WebElement bizeUlasinbittiMesajyazisiBitiHomeDon;
    @FindBy(xpath = "(//i[@class='fa fa-list'])[1]")
    public WebElement textCases;
    @FindBy(xpath = "//i[@class='material-icons card_travel']")

    public WebElement pruductsClick;
    @FindBy(xpath = "//input[@id='search_product']")

    public WebElement urunAraSearch;
    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement urunAraEnter;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement arananUrunlerGorunurlugu;
    @FindBy(xpath = "(//*[text()='Add to cart'])[1]")
    public WebElement ilkUrun;
    @FindBy(xpath = "//div[@class='product-details']")
    public WebElement ilkUrunDetay;
    @FindBy(xpath = "//h2[@class='title text-center']")
    public WebElement tumUrunlerSayfasimi;
    @FindBy(xpath = "//*[text()='Men Tshirt']")
    public WebElement thirtTammi;
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement aboneOlJavaScriptIle;
    @FindBy(xpath = "//*[text()='You have been successfully subscribed!']")
    public WebElement SUBSCRIPTIONYazis;
    @FindBy(xpath = "//*[text()=' Cart']")
    public WebElement cartButton;

    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> urunlerListesi;
    @FindBy(xpath = "(//div[@class='productinfo text-center'])[1]")
    public WebElement ilkUrunn;
    @FindBy(xpath = "By.xpath((//*[@class='fa fa-shopping-cart'])[2]")
    public WebElement sepetOnay;
    @FindBy(xpath = "(//*[@class='productinfo text-center'])[2]")//(//*[@class='productinfo text-center'])[2]
    public WebElement ikinciUrunn;
    @FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[4]")//*[@class='fa fa-shopping-cart'])[4]
    public WebElement ikincisepetOnay;
    @FindBy(xpath = "(//*[text()='View Product'])[2]")//(//*[@class='productinfo text-center'])[2]
    public WebElement ikinciUrunnayrinit;
    @FindBy(xpath = "(//h2[text()='Rs. 1000'])[5]")
    public WebElement soru13UrunSec;
    @FindBy(xpath = "(//a[@data-product-id='29'])[1]")
    public WebElement soru13urunsecAyrinti;
    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")
    public WebElement soru13urunSecSayiArtir;


    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement soru13urunSecSepeteGit;
    @FindBy(xpath = "//*[text()='4']")
    public WebElement soru13urunSecSepeteGitDogrula;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement soru14odemeYap;
    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement soru14odemeYapOnay;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement soru14cinsiyetClick;

    @FindBy(xpath = "//*[text()='Title']")
    public WebElement soru14cinsiyet;
    @FindBy(xpath = "//*[text()='Continue']")
    public WebElement soru14hesapOlusturuldu;

    @FindBy(xpath = " //*[text()=' Cart']")
    public WebElement soru14cart;

    @FindBy(xpath = " //*[text()='Proceed To Checkout']")
    public WebElement soru14cartOde;

    @FindBy(xpath = " //*[text()='Address Details']")
    public WebElement soru14cartOdeIncele;

    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement soru14cartOdeForm;

    @FindBy(xpath = " //*[text()='Place Order']")
    public WebElement soru14cartOdeFormOnay;
    @FindBy(xpath = " //*[text()='Place Order']")
    public WebElement soru14cartOdeFormOnayOdemeSayfasi;
    @FindBy(xpath = "//input[@name='name_on_card']")
    public WebElement soru14cartOdeFormOnayOdemeSayfasiiYazi;

    @FindBy(xpath = "(//div[@class='alert-success alert'])[1]")
    public WebElement soru14cartOdeFormOnayOdemeSayfasiiYaziOnay;

    @FindBy(xpath = "(//*[text()='Rs. 600'])[1]")
    public WebElement soru15UrunSec;

    @FindBy(xpath = "(//*[@data-product-id='3'])[1]")
    public WebElement soru15UrunSecsepeteEkle;
    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement soru15UrunSecsepeteEkleOnay;
    @FindBy(xpath = "//*[@id='cart_info']")
    public WebElement soru15UrunSecsepeteEkleOnaySepetGorunurlugu;
    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement soru15UrunSecsepeteEkleOnayOdeme;


}