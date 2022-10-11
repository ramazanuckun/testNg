package tests.AutomationEnginer;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C02_ikincisoru {
    @Test
    public void test02() {

        AutomationPage automationPage=new AutomationPage();
     //   1. Launch browser
     //   2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
     //   3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
     //   4. Click on 'Signup / Login' button
automationPage.buttonClick.click();
     //   5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPage.hesabaGirisGorunurlugu.isDisplayed());
     //   6. Enter correct email address and password
        Faker faker=new Faker();
        automationPage.girisEmail.sendKeys(ConfigReader.getProperty("automationEmail"));
        automationPage.girisPasword.sendKeys(ConfigReader.getProperty("automationSifre"));
     //   7. Click 'login' button
        automationPage.girisLogin.click();
     //   8. Verify that 'Logged in as username' is visible
        String expected="Logged in as ";


     //   9. Click 'Delete Account' button
        automationPage.deleteHesap.click();
     //   10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertNotEquals("ACCOUNT DELETED!",automationPage.silindiGorunurlugu.getText());
    }
}
