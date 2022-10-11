package tests.day16;

import org.testng.annotations.Test;
import utilitis.TestBaseBeforeMethodAfterMethod;

public class C03_BeforMethodAfterMethod extends TestBaseBeforeMethodAfterMethod{
//(priority = 2)===>testlerimizi calistrrken istenilen siraya gore calisma sirasini ayarlamak icini kullanilan method ismidir
    //(priority = 2) yazmazsak sofor kabul eder default dergerleri baz alacagi icin ilk onu alir 4 /teste bakalim
    @Test(priority = 2)
    public void amazonTesti() {
        driver.get("https://amazon.com");

    }

    @Test(priority = 3)
    public void bestBuyTesti() {

        driver.get("https://bestbuy.com");

    }

    @Test()
    public void a() {
        driver.get("https://hepsiburada.com");
    }

    @Test(priority = 1)
    public void teschproeducationTesti() {

        driver.get("https://youtube.com");

    }

    @Test(priority = -1)
    public void testName() {
        driver.get("https://arabam.com");
    }
}