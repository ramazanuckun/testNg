package tests.day22;

import com.aventstack.extentreports.ExtentReports;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Bluerentalcars;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
/*
  //  -https://www.bluerentalcars.com/ adresine git
  //  -login butonuna bas
  //  -test data user email: customer@bluerentalcars.com ,
  //  -test data password : 12345 dataları girip login e basın
  //  -login butonuna tiklayin
   // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */
Bluerentalcars bluerentalcars=new Bluerentalcars();
    @Test
    public void testName() {
        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");
        //  -https://www.bluerentalcars.com/ adresine git
extentTest.info("buleRentAcar sayfasina gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("blueRentacar"));
        //  -login butonuna bas
        bluerentalcars.loginButton.click();
extentTest.info("login butonuna basildi");
//  -test data user email: customer@bluerentalcars.com ,

bluerentalcars.emailButton.sendKeys(ConfigReader.getProperty("blueRentaCarEmail"));
//  -test data password : 12345 dataları girip login e basın
        bluerentalcars.paswordButton.sendKeys(ConfigReader.getProperty("blueRentAcarpasword"));
        //  -login butonuna tiklayin
        bluerentalcars.emailPaswordOnay.click();
        extentTest.info("Dogru kulanici email girildi ve login butonuna basildi");
        // -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(bluerentalcars.anaSayfa.isDisplayed());
Assert.assertTrue(bluerentalcars.anaSayfa.isDisplayed());
extentTest.pass(" Sayfaya basarili sekilde girildi");

    }
}
