package tests.day17;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FacebookFage;
import utilitis.Driver;

public class C06_PageClassKullanimi {
    @Test
    public void testName() {

        //facebook sayfasina gidelim

        Driver.getDriver().get("https://facebook.com");
        //cookies kabul edin

        // kullanici mail kutusuna rastgele bi r mail yazdirin
        Faker faker=new Faker();

FacebookFage facebookFage=new FacebookFage();
facebookFage.mailKutus.sendKeys(faker.internet().emailAddress());
facebookFage.paswordKutusu.sendKeys(faker.internet().password());
facebookFage.loginKutusu.click();
        Assert.assertTrue(facebookFage.girilemediYazisi.isDisplayed());

        //login butonuna basin
       // giris yapilamadigini test edin
Driver.closeDriver();



    }
}
