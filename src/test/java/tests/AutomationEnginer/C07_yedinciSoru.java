package tests.AutomationEnginer;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C07_yedinciSoru {
    @Test
    public void tes07() {



       // 1. Launch browser
       // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
       // 3. Verify that home page is visible successfully
        AutomationPage automationPage=new AutomationPage();
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
       // 4. Click on 'Test Cases' button
        automationPage.textCases.click();
       // 5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(automationPage.textCases.isDisplayed());
    }
}
