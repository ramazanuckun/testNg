package tests.AutomationEnginer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C08_sekizinciSoru {
    @Test
    public void test08() {
      // 1. Launch browser
      // 2. Navigate to url 'http://automationexercise.com'
        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
      // 3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
      // 4. Click on 'Products' button
automationPage.pruductsClick.click();
      // 5. Verify user is navigated to ALL PRODUCTS page successfully
        Assert.assertTrue(automationPage.pruductsClick.isDisplayed());
      // 6. The products list is visible


      // 7. Click on 'View Product' of first product
        automationPage.ilkUrun.sendKeys(Keys.ENTER);
      // 8. User is landed to product detail page
     //  Assert.assertTrue(automationPage.ilkUrun.isDisplayed());
      // 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
       Assert.assertTrue(automationPage.ilkUrunDetay.isDisplayed());
        //*[text()='Mavi Üst']
    }
}
