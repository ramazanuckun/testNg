package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilitis.Driver;

public class Odev {


   // Bir class oluşturun: DependsOnTest
   // https://www.amazon.com/ adresine gidin.
   // Test : Amazon ana sayfaya gittiginizi test edin
   // Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
   // arama yapin ve aramanizin gerceklestigini Test edin
   // Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
   // $16.83 oldugunu test edin

    @Test
    public void testName() {

        Driver.getDriver().get("https://amazon.com");

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        amazonPage.ilkUrun.click();

    }
}