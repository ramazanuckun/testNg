package tests.day17;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AmazonPage;
import utilitis.Driver;

public class C05_PageClassKullanimi {
    @Test
    public void testName() {
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim
    Driver.getDriver().get("https://amazon.com");
        //nutella aratalim
amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //sonuc yazisinin nutellan icerdigini test edelim
String actualSonuc=amazonPage.aramaSonucElementi.getText();
String expectedAranan="Nutella";
        Assert.assertTrue(actualSonuc.contains(expectedAranan));
    }
}
