package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilitis.Driver;

import java.util.List;

public class WebUniverstyPage {
    public WebUniverstyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(xpath = "//input[@type='text']")
    public WebElement adNewTodo;
    @FindBy(xpath = "//li")
    public List<WebElement>todos;
    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteButtons;
    @FindBy(xpath = "//li")
    public List<WebElement>newtodos;
}
