package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HotelmyCamp;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() throws InterruptedException {
      //Tests packagenin altına class olusturun: CreateHotel

        Driver.getDriver().get(ConfigReader.getProperty("hotelUrl"));
        //Bir metod olusturun: createHotel
      //https://www.hotelmycamp.com adresine git.
      //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        HotelmyCamp hotelmyCamp=new HotelmyCamp();
        hotelmyCamp.loginButton.click();
      //Username : manager
        hotelmyCamp.userName.sendKeys(ConfigReader.getProperty("username"));
      //Password  : Manager1!
        hotelmyCamp.pasworld.sendKeys(ConfigReader.getProperty("pasworld"));
      //        Login butonuna tıklayın.
        hotelmyCamp.loginOnay.click();
      //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        Actions actions1=new Actions(Driver.getDriver());
hotelmyCamp.hotelManagent.click();
hotelmyCamp.hotelManagentReverSeion.click();
hotelmyCamp.hotelManagentReverSeionAddRoom.click();
      //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Faker faker=new Faker();
        hotelmyCamp.idUser.sendKeys("manager");
        actions1.sendKeys(Keys.TAB).sendKeys("Ali Veli")
                .sendKeys(Keys.TAB).sendKeys("2000").sendKeys(Keys.TAB)
                .sendKeys("10/02/2022").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("10/13/2022").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys(faker.name().fullName()).sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys("tatil aile ile guzel").sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)


      //Save butonuna tıklayın.
                .sendKeys(Keys.ENTER).perform();
      //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(2000);
        Assert.assertTrue(hotelmyCamp.roomreversionText.isDisplayed());
      //OK butonuna tıklayın.
Thread.sleep(1000);
hotelmyCamp.okButton.click();


    }
}
