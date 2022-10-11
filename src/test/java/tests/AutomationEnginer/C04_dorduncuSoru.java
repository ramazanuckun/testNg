package tests.AutomationEnginer;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C04_dorduncuSoru {
    @Test
    public void test04() throws InterruptedException {

     //   1. Launch browser
     //   2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
     //   3. Verify that home page is visible successfully
        AutomationPage automationPage=new AutomationPage();
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
     //   4. Click on 'Signup / Login' button
        automationPage.buttonClick.click();
     //   5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPage.hesabaGirisGorunurlugu.isDisplayed());
     //   6. Enter correct email address and password
        automationPage.girisEmail.sendKeys(ConfigReader.getProperty("automationEmail"));
        automationPage.girisPasword.sendKeys(ConfigReader.getProperty("automationSifre"));
     //   7. Click 'login' button
        Thread.sleep(2000);
      automationPage.girisLogin.click();

     //   8. Verify that 'Logged in as username' is visible
       Assert.assertTrue(automationPage.userNameGorunurlugu.isDisplayed());
     //   9. Click 'Logout' button
        automationPage.logoutButton.click();
     //   10. Verify that user is navigated to login page
Assert.assertTrue(automationPage.basaDondumu.isDisplayed());

    }
}
