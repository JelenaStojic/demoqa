package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties extends BasePage {
    public DynamicProperties(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    private By dynamicElements = By.id("item-8");
    private By buttonVisibleAfter5 = By.id("visibleAfter");

    public void clickOnDynamicElements() {
        getDriver().findElement(dynamicElements).click();
    }

    public boolean buttonVisibleAfter5Seconds() {
        getDriverWait().until(ExpectedConditions.elementToBeClickable(buttonVisibleAfter5));
        return getDriver().findElement(buttonVisibleAfter5).isDisplayed();
    }

    public void visibleAfter5Seconds() {
        clickOnDynamicElements();
        buttonVisibleAfter5Seconds();}
}

