package practice06;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.Sauedemo;
import utilitis.Driver;

public class odev01 {
    @Test
    public void testName() {

        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");
        //     * Enter the username  as standard_user
        Sauedemo sauedemo=new Sauedemo();
        sauedemo.userName.sendKeys("standard_user");
        //     * Enter the password as   secret_sauce
        sauedemo.pasword.sendKeys("secret_sauce");
        //     * Click on login button
        sauedemo.click.click();
        //     * Choose price low to highDüşükten yükseğe fiyatı seçin ve PRICE'ın (DÜŞÜKTEN YÜKSEK) olduğunu do
        //       and verify that PRICE (LOW TO HIGH) is
        sauedemo.ddmMenu.click();
        Select select=new Select(sauedemo.ddmMenu);
        select.selectByIndex(2);
        //       and verify that PRICE (LOW TO HIGH) is

        String expected = "PRICE (LOW TO HIGH)";
String actual=sauedemo.secilen.getText();
Assert.assertEquals(expected,actual);
    }
}
