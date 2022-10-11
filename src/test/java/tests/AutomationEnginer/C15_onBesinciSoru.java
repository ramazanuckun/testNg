package tests.AutomationEnginer;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C15_onBesinciSoru {

    AutomationPage automationPage=new AutomationPage();
    Actions actions=new Actions(Driver.getDriver());
Faker faker=new Faker();

    @Test
    public void test15() {

     //  1. Launch browser
     //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
     //  3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
     //  4. Click 'Signup / Login' button
        automationPage.buttonClick.click();
     //  5. Fill all details in Signup and create account
        automationPage.yeniKullaniciName.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        automationPage.soru14cinsiyet.click();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.RIGHT)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("18").sendKeys(Keys.TAB).sendKeys("August").sendKeys(Keys.TAB).sendKeys("1981")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(faker.address().firstName()).sendKeys(Keys.TAB).sendKeys(faker.address().lastName())
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB).sendKeys("Canada")
                .sendKeys(Keys.TAB).sendKeys("saddd")
                .sendKeys(Keys.TAB).sendKeys("saddd")
                .sendKeys(Keys.TAB).sendKeys("dssss")
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())



                . sendKeys(Keys.ENTER).perform();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //  6. Verify 'ACCOUNT CREATED!' and click 'Continue' button
        automationPage.soru14hesapOlusturuldu.click();

     //  7. Verify ' Logged in as username' at top
        String actual=Driver.getDriver().findElement(By.xpath("//*[text()=' Logged in as ']")).getText();
        String expectedd="Logged in as ";
        Assert.assertTrue(actual.contains(expectedd));
     //  8. Add products to cart
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.soru15UrunSec);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        automationPage.soru15UrunSecsepeteEkle.click();
        automationPage.soru15UrunSecsepeteEkleOnay.click();
        //  9. Click 'Cart' button
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
  String expecteed="https://automationexercise.com/view_cart";
       String actualUrl=Driver.getDriver().getCurrentUrl();
Assert.assertEquals(actualUrl,expecteed);
     //  10. Verify that cart page is displayed
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

     //  11. Click Proceed To Checkout
        automationPage.soru15UrunSecsepeteEkleOnayOdeme.click();
     //  12. Verify Address Details and Review Your Order
        Assert.assertTrue(automationPage.soru14cartOdeIncele.isDisplayed());
     //  13. Enter description in comment text area and click 'Place Order'
        automationPage.soru14cartOdeForm.sendKeys("iyiki dogdun");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
     //  14. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        automationPage.soru14cartOdeFormOnayOdemeSayfasiiYazi.sendKeys("123",Keys.ENTER);
        actions
                .sendKeys("123456").sendKeys(Keys.TAB)
                .sendKeys("123")
                .sendKeys(Keys.TAB).sendKeys("123")
                .sendKeys(Keys.TAB).sendKeys("123")
                .sendKeys(Keys.TAB).sendKeys("123")

        //  15. Click 'Pay and Confirm Order' button

                .sendKeys(Keys.ENTER).perform();
     //  16. Verify success message 'Your order has been placed successfully!'
        String expectedonay="Your order has been placed successfully!";
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertNotEquals(automationPage.soru14cartOdeFormOnayOdemeSayfasiiYaziOnay.getText(),expectedonay);
     //  17. Click 'Delete Account' button
        automationPage.deleteHesap.click();
     //  18. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationPage.silindiGorunurlugu.isDisplayed());
        Driver.closeDriver();
    }
}
