package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HotelmyCamp;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C02_SmokeNegatifTest {
    @Test
    public void yanlisKullanici() {
//==============yanlis kullanici dogru sifre ile ilk testimi yapmaliyim==============>
//Bir Class olustur : NegativeTest
        //Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        //     Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //  HmcPage hmcPage = new HmcPage();
        HotelmyCamp hotelmyCamp=new HotelmyCamp();
        //login butonuna bas
        hotelmyCamp.loginButton.click();

        //test data username: manager1 ,  test data password : manager1!

        hotelmyCamp.userName.sendKeys(ConfigReader.getProperty("usernameNegatif"));
        hotelmyCamp.pasworld.sendKeys(ConfigReader.getProperty("pasworld"));
        hotelmyCamp.loginOnay.click();
       /*hocanin cozumu
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        */
        // Actions actions = new Actions(Driver.getDriver());
        //    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());//     .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

        Assert.assertTrue(hotelmyCamp.girilemediYazisi.isDisplayed());
        //    Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test
    public void yanlisSifre() {
//=============================yanlis sifre dogru kullanici ile olmali===============================>
//Bir Class olustur : NegativeTest
        //Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        //     Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //  HmcPage hmcPage = new HmcPage();
        HotelmyCamp hotelmyCamp=new HotelmyCamp();
        //login butonuna bas
        hotelmyCamp.loginButton.click();

        //test data username: manager1 ,  test data password : manager1!

        hotelmyCamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmyCamp.pasworld.sendKeys(ConfigReader.getProperty("pasworldNegatif"));
        hotelmyCamp.loginOnay.click();
       /*hocanin cozumu
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());
        //    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());//     .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

        */
        Assert.assertTrue(hotelmyCamp.girilemediYazisi.isDisplayed());
        //    Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test(groups = "gp2")
    public void yanlisKullaniciSifre() {

        //=======================yanlis kullanici yanlis sifre==========================================>
//Bir Class olustur : NegativeTest
        //Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        //     Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //  HmcPage hmcPage = new HmcPage();
        HotelmyCamp hotelmyCamp=new HotelmyCamp();
        //login butonuna bas
        hotelmyCamp.loginButton.click();

        //test data username: manager1 ,  test data password : manager1!

        hotelmyCamp.userName.sendKeys(ConfigReader.getProperty("usernameNegatif"));
        hotelmyCamp.pasworld.sendKeys(ConfigReader.getProperty("pasworldNegatif"));
        hotelmyCamp.loginOnay.click();
      /*hocanin cozumu
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());
        //    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());//     .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et

       */
        Assert.assertTrue(hotelmyCamp.girilemediYazisi.isDisplayed());
        //    Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();


    }
}
