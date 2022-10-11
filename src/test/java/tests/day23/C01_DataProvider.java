package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C01_DataProvider {

    AmazonPage amazonPage = new AmazonPage();



    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");
        //nutella aratalim
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //sonuc yazisinin nutellan icerdigini test edelim
        String actualSonuc = amazonPage.aramaSonucElementi.getText();
        String expectedAranan = "Nutella";
        Assert.assertTrue(actualSonuc.contains(expectedAranan));
    }
    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"iphone"}};
    }
    @Test(dataProvider = "aranacakKelimeler")
    public void test02(String kelimeler) {

        //amazona gidelim
        Driver.getDriver().get("https://amazon.com");


//java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler, Keys.ENTER);
        String actualSonuc = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualSonuc.contains(kelimeler));
//sonuclarin aradigimiz kelime icerdigini test edelim
//sayfayi kapatalim
    }
}