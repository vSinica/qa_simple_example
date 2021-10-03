package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        wait = new WebDriverWait(driver,15);
    }

    public void waitVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    public void click(By element){
        waitVisibility(element);
        driver.findElement(element).click();
    }

    public void isElementDisplayed(By element){
        waitVisibility(element);
        assertTrue(driver.findElement(element).isDisplayed());
    }

    public void waitForFilling(By elementBy){
        wait.until(ExpectedConditions.elementToBeClickable(elementBy));
    }

    public void writeText(By elementBy, String text) {
        waitVisibility(elementBy);
        WebElement element = driver.findElement(elementBy);
        element.clear();
        element.sendKeys(text);
    }

}
