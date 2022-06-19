package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox extends BasePage{
    public CheckBox(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    private By checkBoxMenu=By.id("item-1");
    private By textResult=By.id("result");

    private By elementsButton=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]");

    private By toggle=By.xpath("//*[@id=\"tree-node\"]/div/button[1]");
    private By angular=By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/ol/li[2]/span/label");

    public void clickOnCheckBox(){
        getDriver().findElement(checkBoxMenu).click();
    }

    public void clickOnToggle(){
        getDriver().findElement(toggle).click();
    }

    public void clickOnOneCheckBox(){
        getDriver().findElement(angular).click();
    }
    public void oneClickCheck(){
        clickOnCheckBox();
        clickOnToggle();
        clickOnOneCheckBox();
    }
    public String messageAfterClicking(){
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(textResult));
        return getDriver().findElement(textResult).getText();
    }
}

