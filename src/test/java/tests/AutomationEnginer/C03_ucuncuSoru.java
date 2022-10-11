package tests.AutomationEnginer;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C03_ucuncuSoru {
    @Test
    public void test03() {
      //  1. Launch browser
      //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
      //  3. Verify that home page is visible successfully
        AutomationPage automationPage=new AutomationPage();
      Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
      //  4. Click on 'Signup / Login' button
        automationPage.buttonClick.click();
      //  5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPage.hesabaGirisGorunurlugu.isDisplayed());
      //  6. Enter incorrect email address and password
        automationPage.girisEmail.sendKeys(ConfigReader.getProperty("automationEmail"));
        automationPage.girisPasword.sendKeys(ConfigReader.getProperty("automationSifre"));

      //  7. Click 'login' button
        automationPage.girisLogin.click();
      //  8. Verify error 'Your email or password is incorrect!' is visible
        String expected="Your email or password is incorrect!";
String actual=automationPage.YanlisGirisGorunurlugu.getText();
Assert.assertTrue(actual.contains(expected));
    }
}
