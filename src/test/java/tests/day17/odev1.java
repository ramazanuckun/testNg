package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilitis.TestBaseBeforeMethodAfterMethod;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class odev1 extends TestBaseBeforeMethodAfterMethod {
//Yeni bir Class Olusturun : C03_SoftAssert
//“http://zero.webappsecurity.com/” Adresine gidin
//Sign in butonuna basin
//Login kutusuna “username” yazin
//Password kutusuna “password” yazin
//Sign in tusuna basin
//Online banking menusu icinde Pay Bills sayfasina gidin
//“Purchase Foreign Currency” tusuna basin
//“Currency” drop down menusunden Eurozone’u secin
//soft assert kullanarak "Eurozone (Euro)" secildigini test edin
//soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin  "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China  (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand  (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"


    @Test
    public void testName() throws InterruptedException {
        SoftAssert softAssert=new SoftAssert();
        //“http://zero.webappsecurity.com/” Adresine gidin
driver.get("http://zero.webappsecurity.com/");
//Sign in butonuna basin
driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        Actions actions1=new Actions(driver);
        WebElement username= driver.findElement(By.xpath("//input[@id='user_login']"));
        username.sendKeys("username");
        Thread.sleep(2000);
        actions1.sendKeys(Keys.TAB)
                .sendKeys("password")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        driver.navigate().back();
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
//Online banking menusu icinde Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        //“Purchase Foreign Currency” tusuna basin
driver.findElement(By.xpath("(//a)[17]")).click();
//“Currency” drop down menusunden Eurozone’u secin
WebElement ddm= driver.findElement(By.xpath("//select[@id='pc_currency']"));
        Select select=new Select(ddm);
       select.selectByIndex(6);
        //soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        String enSecilen=select.getFirstSelectedOption().getText();
        String expectedSecilen="Eurozone (Euro)";

   softAssert.assertEquals(enSecilen,expectedSecilen,"secilen option uygun degil");
//soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin  "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China  (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong  (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand  (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"
        List<WebElement>ddmtum=select.getOptions();
        ddmtum.forEach(t-> System.out.println());
        List<WebElement> ddmList1 = select.getOptions();
        List<String> expectedList = new ArrayList<>(Arrays.asList("Select One", "Australia (dollar)", "Canada (dollar)", "Switzerland (franc)", "China (yuan)", "Denmark (krone)",
                "Eurozone (euro)", "Great Britain (pound)", "Hong Kong (dollar)", "Japan (yen)", "Mexico (peso)", "Norway (krone)", "New Zealand (dollar)",
                "Sweden (krona)", "Singapore (dollar)", "Thailand (baht)"));
        for (int i = 0; i <expectedList.size() ; i++) {

            softAssert.assertEquals(ddmList1.get(i).getText(),
                    expectedList.get(i));
        }

    }
}
