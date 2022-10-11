package tests.AutomationEnginer;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.ReusableMethods;

public class C11_onBirinciSoruu {


    AutomationPage automationPage=new AutomationPage();

    @Test
    public void test11() throws InterruptedException {

        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

       // 3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
       /// 4. Click 'Cart' button
        automationPage.cartButton.click();
       // 5. Scroll down to footer


        ReusableMethods.jsclick(automationPage.aboneOlJavaScriptIle);


       // 6. Verify text 'SUBSCRIPTION'
      Assert.assertTrue(automationPage.aboneOlJavaScriptIle.isDisplayed());
       // 7. Enter email address in input and click arrow button

        automationPage.aboneOlJavaScriptIle.sendKeys("rru@gmail.com", Keys.ENTER);

      //  8. Verify success message 'You have been successfully subscribed!' is visible

    }
    }

