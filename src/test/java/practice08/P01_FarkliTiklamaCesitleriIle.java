package practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HerokuTestPage;
import utilitis.Driver;

import java.util.List;

public class P01_FarkliTiklamaCesitleriIle {


   HerokuTestPage herokuTestPage=new HerokuTestPage();
Actions actions=new Actions(Driver.getDriver());
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked



    @Test
    public void test1() throws InterruptedException {

Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");
herokuTestPage=new HerokuTestPage();

//kodlarımızı yazrken clean kod kapsamında daha sade kod yazabilmek amacıyla
        //her test methodu içerisinde, ayrı bir object create temektense bu
        // objecti class seviyesinde instance olarak create edip
        //test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        herokuTestPage.onblur.click();//bunun click olmasi icin baska bir inin tiklanmasi lazim
        herokuTestPage.contextmenu.click();//contexmenu sagclick demek ve bunu yapabilmek icin actions yapmam lazim
        herokuTestPage.onclick.click();
        actions.contextClick(herokuTestPage.contextmenu)
                .doubleClick(herokuTestPage.doubleClick)
                .click(herokuTestPage.onfocus)
                .click(herokuTestPage.keydown).sendKeys(Keys.ENTER)//keyDown ukalvye ile actions istoyor enter tusuna basinca activite oldu bunu burrada sendkeys ile yapacagiz
                .click(herokuTestPage.keyup).sendKeys(Keys.ENTER)//yukaridakinini aynisi gecerli
                .click(herokuTestPage.keypress).sendKeys(Keys.ENTER)
                .moveToElement(herokuTestPage.mouseOver)//mouse element uzerine gidir pover over
                .moveToElement(herokuTestPage.mouseLeave).moveToElement(herokuTestPage.mouseOver)//uzerine gittim uzerinden ayrildim
                .click(herokuTestPage.mouseDown).perform();

Thread.sleep(2000);



    }

    @Test(dependsOnMethods = "test1")
    public void test02() {

        List<WebElement>click=herokuTestPage.eventTrigint;
        Assert.assertEquals(click.size(),11);
    }
}
