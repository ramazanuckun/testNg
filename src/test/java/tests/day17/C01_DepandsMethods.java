package tests.day17;

import org.testng.annotations.Test;
import utilitis.TestBaseBeforeMethodAfterMethod;

public class C01_DepandsMethods extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        driver.get("whttps://amazon.com");

    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        driver.get("https://facebook.com");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
driver.get("https://bestbuy.com");
    }

    @Test
    public void test04() {
driver.get("https://youtube.com");
    }
}
