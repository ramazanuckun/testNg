package tests.AutomationEnginer;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;

import java.util.ArrayList;
import java.util.List;

public class C14_onDorduncuSoru {

    AutomationPage automationPage=new AutomationPage();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void testName() throws InterruptedException {
//1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

       //3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());

       //4. Add products to cart
       //5. Click 'Cart' button
       //6. Verify that cart page is displayed
        automationPage.pruductsClick.click();
        String ecpectedUrl="https://automationexercise.com/products";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ecpectedUrl);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.soru13UrunSec);
        Thread.sleep(2000);


        automationPage.soru13urunsecAyrinti.click();
        automationPage.soru13urunSecSayiArtir.click();


        automationPage.soru13urunsecAyrinti.click();
        automationPage.soru13urunSecSayiArtir.click();
        automationPage.soru13urunsecAyrinti.click();
        automationPage.soru13urunSecSayiArtir.click();
        automationPage.soru13urunsecAyrinti.click();

        automationPage.soru13urunSecSepeteGit.click();



        String expected="4";
        Assert.assertTrue(automationPage.soru13urunSecSepeteGitDogrula.getText().contains(expected));

        //7. Click Proceed To Checkout

        automationPage.soru14odemeYap.click();
       //8. Click 'Register / Login' button
        automationPage.soru14odemeYapOnay.click();
       //9. Fill all details in Signup and create account
        Faker faker=new Faker();
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


       //10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
              . sendKeys(Keys.ENTER).perform();
       //11. Verify ' Logged in as username' at top
       automationPage.soru14hesapOlusturuldu.click();
       String actual=Driver.getDriver().findElement(By.xpath("//*[text()=' Logged in as ']")).getText();
       String expectedd="Logged in as ";
       Assert.assertTrue(actual.contains(expectedd));
       //12.Click 'Cart' button
        automationPage.soru14cart.click();
       //13. Click 'Proceed To Checkout' button
        automationPage.soru14cartOde.click();
       //14. Verify Address Details and Review Your Order
        Assert.assertTrue(automationPage.soru14cartOdeIncele.isDisplayed());

       //15. Enter description in comment text area and click 'Place Order'
        automationPage.soru14cartOdeForm.sendKeys("iyiki dogdun");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
       //16. Enter payment details: Name on Card, Card Number, CVC, Expiration date



            /*  actions  .sendKeys(Keys.TAB).sendKeys("1234567891234567")
                .sendKeys(Keys.TAB).sendKeys("311")
                .sendKeys(Keys.TAB).sendKeys("rr")
                .sendKeys(Keys.TAB).sendKeys("2015")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();


             */

automationPage.soru14cartOdeFormOnayOdemeSayfasiiYazi.sendKeys("123",Keys.ENTER);
actions
        .sendKeys("123456").sendKeys(Keys.TAB)
        .sendKeys("123")
        .sendKeys(Keys.TAB).sendKeys("123")
        .sendKeys(Keys.TAB).sendKeys("123")
        .sendKeys(Keys.TAB).sendKeys("123")



       //17. Click 'Pay and Confirm Order' button

        .sendKeys(Keys.ENTER).perform();
       //18. Verify success message 'Your order has been placed successfully!'

String expectedonay="Your order has been placed successfully!";

Assert.assertNotEquals(automationPage.soru14cartOdeFormOnayOdemeSayfasiiYaziOnay.getText(),expectedonay);
       //19. Click 'Delete Account' button
        automationPage.deleteHesap.click();

       //20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
        Assert.assertTrue(automationPage.silindiGorunurlugu.isDisplayed());
    }
}
