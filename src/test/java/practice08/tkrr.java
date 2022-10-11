package practice08;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HerokuTestPage;
import utilitis.Driver;

import java.util.List;

public class tkrr {

HerokuTestPage herokuTestPage=new HerokuTestPage();
Actions actions=new Actions(Driver.getDriver());


    @Test
    public void testName() throws InterruptedException {

        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        //Click all the buttons and verify they are all clicked
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
        //Click all the buttons and verify they are all clicked
herokuTestPage.onblur.click();
herokuTestPage.onclick.click();
herokuTestPage.onclick.click();
actions.contextClick(herokuTestPage.contextmenu)
        .doubleClick(herokuTestPage.doubleClick)
        .click(herokuTestPage.onfocus)
        .click(herokuTestPage.keydown).sendKeys(Keys.ENTER)
        .click(herokuTestPage.keyup).sendKeys(Keys.ENTER)
        .click(herokuTestPage.keypress).sendKeys(Keys.ENTER)

        .moveToElement(herokuTestPage.mouseOver).moveToElement(herokuTestPage.mouseLeave).moveToElement(herokuTestPage.mouseOver)
        .click(herokuTestPage.mouseDown).perform();
Thread.sleep(2000);
        List<WebElement>control=Driver.getDriver().findElements(By.xpath("//*[.='Event Triggered']"));

        Assert.assertEquals(control.size(),11);

     //   Driver.closeDriver();

    }
}
