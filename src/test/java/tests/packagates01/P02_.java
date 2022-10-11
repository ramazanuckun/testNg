package tests.packagates01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.TestBaseBeforeMethodAfterMethod;

public class P02_ extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void testName() {

// 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
driver.findElement(By.xpath("//span[@id='button1']")).click();

// 3. Açılır metni alın

        String actualTest=driver.switchTo().alert().getText();


// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.==esitlik istiyor
        String expectedTest="I am an alert box!";
       // Assert.assertTrue(actualTest.contains(expectedTest));
        Assert.assertEquals(expectedTest,actualTest);
// 5. Açılır pencereyi kabul edin
driver.switchTo().alert().accept();
    }
}
