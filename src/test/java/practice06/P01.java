package practice06;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.DhtmlgoodiesPage;
import utilitis.Driver;

public class P01 {

    @Test
    public void test01() {

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html


        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


// Fill in capitals by country.
        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();

       Actions actions1=new Actions(Driver.getDriver());
      /*  actions1.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.Sweden).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.UnitedStates).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.seol, dhtmlgoodiesPage.SouthKorea).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.stocholm, dhtmlgoodiesPage.italy).perform();
        actions1.dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy).perform();


       */

actions1.dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.Norvay)
        .dragAndDrop(dhtmlgoodiesPage.rome, dhtmlgoodiesPage.italy)
        .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.spain)
        .dragAndDrop(dhtmlgoodiesPage.seol, dhtmlgoodiesPage.SouthKorea)
        .dragAndDrop(dhtmlgoodiesPage.kopenhang, dhtmlgoodiesPage.Denmark)
        .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.UnitedStates)
        .dragAndDrop(dhtmlgoodiesPage.stocholm, dhtmlgoodiesPage.Sweden)
        .perform();



/*
Framewokler buyudukce yeni classlar yeni test methodlari yeni webelementler olustrdukca icinden cikilmaz anlasilmaz guncellemesi cok zor hatta imkansiz bir hal alir
uzmanlar resable maintainable,rahat manipule edilebilir bir framwork icin bir desiggn pattern olarak
pom page objetct model karar vermisler
===olmazsa olmazla===
1-driver class
2-page class
3-test class
utilitlesaradiginiz bir web elementi
 */
    }
}
