package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private By header = By.xpath("//*[@id=\"app\"]/header/a");
    private By elements= By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]");
    private By forms = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]");
    private By alerts = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]");
    private By widgets = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[4]");
    private By interactions = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[5]");
    private By bookStore = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]");

    public HomePage(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getHeader() {
        return getDriver().findElement(header);
    }

    public WebElement getElements() {
        return getDriver().findElement(elements);
    }

    public WebElement getForms() {
        return getDriver().findElement(forms);
    }

    public WebElement getAlert() {
        return getDriver().findElement(alerts);
    }

    public WebElement getWidgets() {
        return getDriver().findElement(widgets);
    }

    public WebElement getInteractions() {
        return getDriver().findElement(interactions);
    }

    public WebElement getBookStore() {
        return getDriver().findElement(bookStore);
    }

    public void headerClick(){getActions().moveToElement(getHeader()).click().perform();}

    public void elementsClick(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
        jsExecutor.executeScript("window.scrollBy(0,500)");
        getElements().click();}

    public void formsClick(){
        getActions().moveToElement(getForms()).click().perform();}

    public void alertsClick(){
        getActions().moveToElement(getAlert()).click().perform();}

    public void widgetsClick(){
        getActions().moveToElement(getWidgets()).click().perform();}

    public void interactionsClick(){
        getActions().moveToElement(getInteractions()).click().perform();}


    public void javaExecutorScrollIntoView(By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView()", element(locator));
    }


}

