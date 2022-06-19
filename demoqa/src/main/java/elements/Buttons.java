
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Buttons extends BasePage{
    public Buttons(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    private By buttons = By.id("item-4");
    private By doubleClickMe = By.id("doubleClickBtn");
    private By rightClickMe = By.id("rightClickBtn");
    private By clickMeButton = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button");
    private By responseDynamicClick = By.id("dynamicClickMessage");
    private By responseDoubleClickMeMessage = By.id("doubleClickMessage");
    private By rightClickResponse = By.id("rightClickMessage");


    public WebElement getButtons() {return getDriver().findElement(buttons);}

    public void clickClickMeButton() {
        click(clickMeButton);
    }


    public String responseClickMe() {
        return getSummary(responseDynamicClick);
    }

    public void doubleClickMeButton() {
        doubleClick(doubleClickMe);
    }

    public String doubleClickResponse() {
        return getSummary(responseDoubleClickMeMessage);
    }

    public void rightClickButton() {
        rightClick(rightClickMe);
    }

    public String getRightClickResponse() {
        return getSummary(rightClickResponse);
    }
    public void clickButtons(){
        getDriver().findElement(buttons).click();
    }

    public void clickOnButtons(){
        clickButtons();
        doubleClickMeButton();
        rightClickButton();
        clickClickMeButton();
    }

}
