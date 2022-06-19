package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;


    public BasePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        this.driver = driver;
        this.driverWait = driverWait;
        this.actions=actions;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public Actions getActions() {
        return actions;
    }
    public WebElement element(By locator) {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void click(By locator) {
        element(locator).click();

    }
    public void doubleClick(By locator) {
        actions.doubleClick(element(locator)).build().perform();
    }
    public void rightClick(By locator) {
        actions.contextClick(element(locator)).build().perform();
    }
    public String getSummary(By locator) {
        return element(locator).getText();
    }

}

