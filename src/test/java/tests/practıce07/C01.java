package tests.practıce07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.WebUniverstyPage;
import utilitis.ConfigReader;
import utilitis.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01 {
    @Test
    public void testName() throws InterruptedException {
//EXPLORATORY testing=
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("todoList"));
// Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)

        WebUniverstyPage webUniverstyPage=new WebUniverstyPage();
   //List sunu yaptim:yapilacaklar listesine manuel olarak eklemeke yerine bir loop kullanarak gonderebilmek amamci ile bir list olustrduk
        List<String>workList=new ArrayList<>(Arrays.asList("Kahvaltiyi Hazirla","Bulasiklari yika","Bebekle Ilgilen",
                "Çocuğunun ödevine yardım et","Selenyum çalış","Uyu"));
        Actions actions1=new Actions(Driver.getDriver());
        for (String w:workList
             ) {
         actions1.click(webUniverstyPage.adNewTodo)
                 .sendKeys(w).sendKeys(Keys.ENTER).perform();

        }




//Tüm yapılacakların üzerini çiz.

//her defaSINDA TODOS GIDIP TIKLAMAM GEREKIYOR BUNU TOPTAN YAPABILMEM ICIN todos ismini koydugum locateleri bir liste atadim
        List<WebElement>todos=webUniverstyPage.todos;

        for (WebElement w:todos
             ) {
            w.click();
        }


//Tüm yapılacakları sil.
        List<WebElement> delete=webUniverstyPage.deleteButtons;
/*//1.yol for each ile
        for (WebElement w:delete
             ) {
            w.click();
        }

 *///2.yol for each ile
   //     delete.forEach(t->t.click());
//*/3.yol for i ile
        for (int i = 0; i <delete.size() ; i++) {
            delete.get(i).click();
        }
//Tüm yapılacakların silindiğini doğrulayın.

        //bir kac yontemi varmis //li taki yoksa

      List<WebElement> newTodos=  webUniverstyPage.newtodos;
        Thread.sleep(2000);
        Assert.assertEquals(0,newTodos.size());
    }
}
