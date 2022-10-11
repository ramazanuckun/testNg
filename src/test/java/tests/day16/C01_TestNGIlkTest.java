package tests.day16;

import org.testng.annotations.Test;
import utilitis.TestBaseBeforeMethodAfterMethod;

public class C01_TestNGIlkTest extends TestBaseBeforeMethodAfterMethod {
    @Test(groups = "gp1")
    public void amazonTesti() {
        driver.get("https://amazon.com");

    }

    @Test
    public void bestBuyTesti() {

    driver.get("https://bestbuy.com");

    }

    @Test
    public void teschproeducationTesti() {

        driver.get("https://techproeducation.com");
    }
}
