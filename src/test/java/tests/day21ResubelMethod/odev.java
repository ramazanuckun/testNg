package tests.day21ResubelMethod;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.Hepsiburada;
import utilitis.ConfigReader;
import utilitis.Driver;
import utilitis.ReusableMethods;

public class odev {

    Actions actions=new Actions(Driver.getDriver());
    /*//Hepsiburada sayfasına gidiniz
//Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
//Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
//Sayfayı kapatalım

     */

    @Test
    public void testName() {
    //Hepsiburada sayfasına gidiniz



        Driver.getDriver().get(ConfigReader.getProperty("hepsiburada"));
        Hepsiburada hepsiburada=new Hepsiburada();

//Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım


    }
}
