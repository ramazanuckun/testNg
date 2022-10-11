package utilitis;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestBaseBeforeMethodAfterMethod {

    protected WebDriver driver;
protected Actions actions;
protected String tarih;
//TestNG framework unda @before veAfter natosyonlari kullanilir
    //Junit calisma prensibi Before ve After ile ayndir
    @BeforeMethod(groups = {"gp1","gp2"})
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        LocalDateTime date=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("YYMMddHHmmSS");

        tarih=date.format(formatter);
        actions=new Actions(driver);
    }
    @AfterMethod(groups = {"gp1","gp2"})
    public void tearDown() {
       driver.close();
    }
}


