package tests.day23;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.Bluerentalcars;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C02_DataProvider {

    Bluerentalcars bluerentalcars=new Bluerentalcars();
Actions actions=new Actions(Driver.getDriver());
    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"rru.3206@gmail.com","12345"},{"rru@gmail.com","45678"},{"rruuu@gmail.com","91234"}};
    }

    @Test(dataProvider = "kullanicilar")
    public void testName(String userEmail,String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blueRentacar"));


        //login butonuna bas
        bluerentalcars.loginButton.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        bluerentalcars.emailButton.sendKeys(userEmail);
//  -test data password : 12345 dataları girip login e basın
        bluerentalcars.paswordButton.sendKeys(password);
        //  -login butonuna tiklayin
        bluerentalcars.emailPaswordOnay.click();

        //login butonuna tiklayin
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
Assert.assertTrue(bluerentalcars.ikinciLogin.isDisplayed());


    }
}
