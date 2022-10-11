package tests.AutomationEnginer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C06_altinciSoru {
    @Test
    public void test06() throws InterruptedException {
     // 1. Launch browser
     // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
     // 3. Verify that home page is visible successfully
        AutomationPage automationPage=new AutomationPage();
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
     // 4. Click on 'Contact Us' button
automationPage.bizeUlasin.click();
     // 5. Verify 'GET IN TOUCH' is visible
Assert.assertTrue(automationPage.bizeUlasinGorunurlugu.isDisplayed());
     // 6. Enter name, email, subject and message
     automationPage.bizeUlasinName.sendKeys(ConfigReader.getProperty("ilkUserName"));
        Actions actions1=new Actions(Driver.getDriver());
       actions1.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("automationEmail"))
               .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("subject"))
               .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("mesaj")).sendKeys(Keys.ENTER).perform();


     // 7. Upload file
        String dosyaYolu="C:\\Users\\Kullanıcı\\Desktop\\Yeni OpenDocument Metni.odt";
        automationPage.bizeUlasinDosyaYuke.sendKeys(dosyaYolu);
     // 8. Click 'Submit' button

        Thread.sleep(2000);
        automationPage.bizeUlasinbitti.submit();
     // 9. Click OK button
Driver.getDriver().switchTo().alert().accept();
     // 10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        Assert.assertTrue(automationPage.bizeUlasinbittiMesajyazisi.getText().contains("Success! Your details have been submitted successfully."));

        Thread.sleep(2000);

     // 11. Click 'Home' button and verify that landed to home page successfully
      automationPage.bizeUlasinbittiMesajyazisiBitiHomeDon.click();
    }
}
