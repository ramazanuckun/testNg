package tests.AutomationEnginer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C10_onuncuSoru {
    @Test
    public void test10() throws InterruptedException {
        AutomationPage automationPage=new AutomationPage();
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        //   1. Launch browser
        // 2. Navigate to url 'http://automationexercise.com'
        // 3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
        //4. Scroll down to footersubscription
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();


       jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.aboneOlJavaScriptIle);
        //5. Verify text 'SUBSCRIPTION'
        Assert.assertTrue(automationPage.aboneOlJavaScriptIle.isDisplayed());
        //6. Enter email address in input and click arrow button
        Thread.sleep(3000);
        Actions actions1=new Actions(Driver.getDriver());

      WebElement element= automationPage.aboneOlJavaScriptIle;
              element.sendKeys("rru.32066@gmail.com",Keys.ENTER);



        //7. Verify success message 'You have been successfully subscribed!' is visible


    }
}
