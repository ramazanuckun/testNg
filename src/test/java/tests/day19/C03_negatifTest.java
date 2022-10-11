package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HotelmyCamp;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C03_negatifTest {
    @Test
    public void testName() {

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
     //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
   // Actions actions = new Actions(Driver.getDriver());
    //    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPass"))
        //   hmcPage.userName.sendKeys(ConfigReader.getProperty("hmcWrongUser"));
        // Actions actions = new Actions(Driver.getDriver());//     .sendKeys(Keys.ENTER).perform();
    //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hotelmyCamp.girilemediYazisi.isDisplayed());
    //    Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
    //Sayfayı kapatınız
       Driver.closeDriver();
}}
