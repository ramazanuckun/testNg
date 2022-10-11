package tests.AutomationEnginer;

import org.apache.commons.collections4.functors.WhileClosure;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AutomationPage;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.TestBaseRapor;

public class C13_onUcuncuSoru extends TestBaseRapor {


//    1. Launch browser
//2. Navigate to url 'http://automationexercise.com'
//            3. Verify that home page is visible successfully
//          4. Click 'View Product' for any product on home page

//5. Verify product detail is opened
//6. Increase quantity to 4
//            7. Click 'Add to cart' button
//8. Click 'View Cart' button
//9. Verify that product is displayed in cart page with exact quantity
AutomationPage automationPage=new AutomationPage();
Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test13() throws InterruptedException {
        extentTest=extentReports.createTest("Pozitif test,gecerli veriler  ile alisveris");
        //2. Navigate to url 'http://automationexercise.com'
        extentTest.info("sayfaya gidildi");
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
//            3. Verify that home page is visible successfully
        Assert.assertTrue(automationPage.AutomatinGorunurlugu.isDisplayed());
//          4. Click 'View Product' for any product on home page
extentTest.info("veriler girildi");
   automationPage.pruductsClick.click();
        String ecpectedUrl="https://automationexercise.com/products";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ecpectedUrl);
        JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
jse.executeScript("arguments[0].scrollIntoView(true);",automationPage.soru13UrunSec);
Thread.sleep(2000);
         //5. Verify product detail is opened
        //6. Increase quantity to 4
        //7. Click 'Add to cart' button
        //8. Click 'View Cart' button
automationPage.soru13urunsecAyrinti.click();
automationPage.soru13urunSecSayiArtir.click();


        automationPage.soru13urunsecAyrinti.click();
        automationPage.soru13urunSecSayiArtir.click();
        automationPage.soru13urunsecAyrinti.click();
        automationPage.soru13urunSecSayiArtir.click();
        automationPage.soru13urunsecAyrinti.click();

        automationPage.soru13urunSecSepeteGit.click();

//9. Verify that product is displayed in cart page with exact quantity

String expected="4";
Assert.assertTrue(automationPage.soru13urunSecSepeteGitDogrula.getText().contains(expected));
Driver.closeDriver();
extentTest.pass("test bitti");
    }

    @Test(dependsOnMethods = "test13")
    public void testName() {Driver.closeDriver();
    }
}
