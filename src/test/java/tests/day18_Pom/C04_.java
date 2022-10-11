package tests.day18_Pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HotelmyCamp;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C04_ {
    @Test
    public void testName() {

      //  Bir Class olustur : PositiveTest
      //  2) Bir test method olustur positiveLoginTest()  https://www.hotelmycamp.com/ adresine git  login butonuna bas\

        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
       // test data username: manager ,  test data password : Manager1!
        HotelmyCamp hotelmyCamp=new HotelmyCamp();
        hotelmyCamp.loginButton.click();

        hotelmyCamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmyCamp.pasworld.sendKeys(ConfigReader.getProperty("pasworld"));
        hotelmyCamp.loginOnay.click();
         ///       Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
   Assert.assertTrue(hotelmyCamp.icindeBulunulan.isDisplayed());
    }
}
