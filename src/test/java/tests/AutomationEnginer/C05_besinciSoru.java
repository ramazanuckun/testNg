package tests.AutomationEnginer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C05_besinciSoru {
    @Test
    public void test5() throws InterruptedException {

      //1. Launch browser
      //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

      //3. Verify that home page is visible successfully
        AutomationPage automationPage=new AutomationPage();
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
      //4. Click on 'Signup / Login' button
        automationPage.buttonClick.click();
      //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationPage.hesabaGirisGorunurlugu.isDisplayed());
      //6. Enter name and already registered email address
        Actions actions1=new Actions(Driver.getDriver());
        //actions1.sendKeys(automationPage.userNameGorunurlugu).
          //      sendKeys(ConfigReader.getProperty("ilkUserName")).sendKeys(Keys.TAB)
            //    .sendKeys(ConfigReader.getProperty("automationEmail")).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
      automationPage.yeniKullaniciName.sendKeys(ConfigReader.getProperty("ilkUserName"));
automationPage.yeniKullaniciEmail.sendKeys(ConfigReader.getProperty("automationEmail"));
actions1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //7. Click 'Signup' button
        actions1.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
      //8. Verify error 'Email Address already exist!' is visible
        String expected="Email Address already exist!";
Thread.sleep(3000);
   //     Assert.assertTrue(automationPage.yeniKullaniciEmailKayitliKayitBasarisiz.isDisplayed());
    }
}
