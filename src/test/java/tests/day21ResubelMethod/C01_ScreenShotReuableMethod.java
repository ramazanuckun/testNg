package tests.day21ResubelMethod;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReuableMethod {

    @Test
    public void test01() throws IOException {

        //Hepsiburada sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada"));

        //sayfanin resmini aliniz
        ReusableMethods.getScreenshot("hepsiburada");

//lutfen sayfayi kapatiniz

        Driver.closeDriver();

    }

    @Test
    public void test2() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        ReusableMethods.getScreenshotWebElement("AramaSonucWebElementi",amazonPage.aramaSonucElementi);
    }
}
