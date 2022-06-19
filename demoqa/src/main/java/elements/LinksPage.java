package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage extends BasePage {
    public LinksPage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    private By links = By.xpath("//*[@id=\"item-5\"]");
    private By notFound = By.id("invalid-url");
    private By textResult = By.id("linkResponse");

    public void clickOnLinks() {
        getDriver().findElement(links).click();
    }

    public void clickOnNotFound(){

        getDriver().findElement(notFound).click();
    }

    public String messageAfterClicking() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(textResult));
        return getDriver().findElement(textResult).getText();
    }
    public void clickOnNotFoundLink(){
        clickOnLinks();
        clickOnNotFound();
    }
}
