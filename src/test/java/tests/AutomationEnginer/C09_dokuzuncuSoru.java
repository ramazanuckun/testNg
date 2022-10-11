package tests.AutomationEnginer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C09_dokuzuncuSoru {
    @Test
    public void test09() {

        AutomationPage automationPage=new AutomationPage();
      // 1. Launch browser
      // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        // 3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());

      // 4. Click on 'Products' button
   automationPage.pruductsClick.click();
      // 5. Verify user is navigated to ALL PRODUCTS page successfully
Assert.assertTrue(automationPage.tumUrunlerSayfasimi.getText().contains("ALL PRODUCTS"));
      // 6. Enter product name in search input and click search button
        automationPage.urunAraSearch.sendKeys("Men Tshirt");
        automationPage.urunAraEnter.click();
      // 7. Verify 'SEARCHED PRODUCTS' is visible
        Assert.assertTrue(automationPage.arananUrunlerGorunurlugu.getText().contains("SEARCHED PRODUCTS"));
      // 8. Verify all the products related to search are visible
Assert.assertTrue(automationPage.thirtTammi.getText().contains("Men Tshirt"));
Driver.getDriver().close();

    }
}
