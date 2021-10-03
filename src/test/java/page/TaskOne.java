package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TaskOne extends BasePage{
    public TaskOne(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkPageIsCorrect(){
        isElementDisplayed(By.xpath("//li[text()='Zadanie 1']"));
    }
}
