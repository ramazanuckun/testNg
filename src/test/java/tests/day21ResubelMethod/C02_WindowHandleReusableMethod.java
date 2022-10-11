package tests.day21ResubelMethod;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.Driver;
import utilitis.ReusableMethods;

import java.util.ArrayList;

public class C02_WindowHandleReusableMethod
{

    @Test
    public void test1() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");

        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();


        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
//sorunun 1.cozum yolu
        ArrayList<String>pencereler=new ArrayList<>(Driver.getDriver().getWindowHandles());

Driver.getDriver().switchTo().window(pencereler.get(1));
String epectedTitle="New Window";
String actualtitle=Driver.getDriver().getTitle();
        Assert.assertEquals(epectedTitle,actualtitle);
        Driver.closeDriver();

    }

    @Test
    public void ReusableMethodileCozum() {

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get(" https://the-internet.herokuapp.com/windows");

        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();


        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
//sorunun 2.cozum yolu
ReusableMethods.waitFor(3);
        ReusableMethods.switchToWindow("New Window");// ==karsiligi    ArrayList<String>pencereler=new ArrayList<>(Driver.getDriver().getWindowHandles());
                                                                              //     Driver.getDriver().switchTo().window(pencereler.get(1));


        String epectedTitle="New Window";
        String actualtitle=Driver.getDriver().getTitle();
        Assert.assertEquals(epectedTitle,actualtitle);
Driver.closeDriver();


    }
}

