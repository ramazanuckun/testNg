package tests.day18_Pom;

import org.testng.annotations.Test;
import utilitis.ConfigReader;
import utilitis.Driver;

public class C03_ConfiurationPrpoperties {
    @Test
    public void testName() {


        //amazon sayfasina gidelim
        String urlAmazon=ConfigReader.getProperty("amazonUrl");
        Driver.getDriver().get(urlAmazon);

        String urlFace=ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlFace);

    }
}
