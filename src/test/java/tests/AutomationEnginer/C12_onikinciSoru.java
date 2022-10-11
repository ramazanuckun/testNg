package tests.AutomationEnginer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.ReusableMethods;

import static utilitis.Driver.driver;

public class C12_onikinciSoru {

//1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click 'Products' button
//5. Hover over first product and click 'Add to cart'
//6. Click 'Continue Shopping' button
//7. Hover over second product and click 'Add to cart'
// 8. Click 'View Cart' button
//9. Verify both products are added to Cart
//10. Verify their prices, quantity and total price

    AutomationPage automationPage=new AutomationPage();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void test12() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
//3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
//4. Click 'Products' button
        automationPage.pruductsClick.click();
//5. Hover over first product and click 'Add to cart'
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.ilkUrun);
  actions.moveToElement(automationPage.ilkUrun).perform();
        String product1Price = Driver.getDriver().findElement(By.xpath("(//h2)[4]")).getText();

//6. Click 'Continue Shopping' button
automationPage.sepetOnay.click();
//7. Hover over second product and click 'Add to cart'
ReusableMethods.jsclick(automationPage.ikinciUrunn);

actions.moveToElement(automationPage.ikinciUrunn).perform();
        String product2Price = Driver.getDriver().findElement(By.xpath("(//h2)[6]")).getText();
        Thread.sleep(2000);
actions.moveToElement(automationPage.ikincisepetOnay).click().perform();
// 8. Click 'View RCart' button

//9. Verify both products are added to C
//10. Verify their prices, quantity and total price

    }
}
