package practive09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

import java.util.List;

public class P01 {

    // 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Ürünler' butonuna tıklayın
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    AutomationPage automationPage=new AutomationPage();
Actions actions=new Actions(Driver.getDriver());
    @Test
    public void searchProducPage() {
// 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
/*
unige elementi o sayfaadaki ogeyi bul isdisplayrd ile bu tip sorulari coz
 */
String homeUrl="https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),homeUrl);

        // 4. 'Ürünler' butonuna tıklayın
        automationPage.pruductsClick.click();
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
Assert.assertTrue(automationPage.tumUrunlerSayfasimi.isDisplayed());

String ecpectedUrl="https://automationexercise.com/products";
Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ecpectedUrl);
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
automationPage.urunAraSearch.sendKeys("blue top", Keys.TAB,Keys.ENTER);
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        List<WebElement>urunlerListesi=automationPage.urunlerListesi;
      /*  for (WebElement w:urunlerListesi
        ) {
            Assert.assertTrue(w.isDisplayed());
        }

       */

Assert.assertTrue(automationPage.arananUrunlerGorunurlugu.isDisplayed());
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın


    }
}
