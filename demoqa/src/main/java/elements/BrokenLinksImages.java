package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksImages extends BasePage{
    public BrokenLinksImages(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }
    private By brokenLinksImages=By.xpath("//*[@id=\"item-6\"]");
    private By validLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]");
    private By brokenLink = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[2]");

    private By textBrokenLink= By.xpath("//*[@id=\"content\"]/div");


    public void clickOnBrokenLinksImages(){
        getDriver().findElement(brokenLinksImages).click();
    }
    public void clickValidLink(){
        getDriver().findElement(validLink).click();
    }

    public void clickBrokenLink(){
        getDriver().findElement(brokenLink).click();
    }
    public void validLink(){
        clickOnBrokenLinksImages();
        clickValidLink();
    }
    public void brokenLink(){
        clickOnBrokenLinksImages();
        clickBrokenLink();
    }

    public String getUrl(){
        return getDriver().getCurrentUrl();
    }

    public String textBrokenLink(){
        return getDriver().findElement(textBrokenLink).getText();
    }
}


