package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.TestBaseBeforeMethodAfterMethod;

public class C04_DependsOnMethod extends TestBaseBeforeMethodAfterMethod {

    @Test
    public void Test1() {
        driver.get("https://amazon.com");

    }    @Test
    public void Testi2() {

//nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);


    }    @Test
    public void Test3() {

   //sonuc yazisinin amazon icerdigini test edelim

    }
}
