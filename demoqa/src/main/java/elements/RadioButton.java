package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RadioButton extends BasePage{


    private By radioBtn = By.id("item-2");
    private By yesBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label");
    private By impressiveBtn = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/label");
    private By noBtn = By.id("noRadio");
    private By yesMessage = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/p");
    private By response=By.className("mt-3");
    private By buttons=By.xpath("//*[contains(@class,\"custom-control-inline\")]");

    public RadioButton(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getRadioBtn() {return getDriver().findElement(radioBtn);}

    public WebElement getYesBtn() {return getDriver().findElement(yesBtn);}

    public WebElement getImpressiveBtn(){return getDriver().findElement(impressiveBtn);}


    public String responseRadioButton(){
        return getSummary(response);
    }
    public void clickRadioBtn(){
        getDriver().findElement(radioBtn).click();
    }

    public void clickYesBtn(){getActions().moveToElement(getYesBtn()).click().perform();}

    public void clickImpressiveBtn(){getActions().moveToElement(getImpressiveBtn()).click().perform();}

    public boolean isNoBtnClicable(){return getDriver().findElement(noBtn).isEnabled();}

    public boolean impressiveNotSelected(){
        return getDriver().findElement(impressiveBtn).isSelected();
    }
    public boolean yesNotSelected(){
        return getDriver().findElement(yesBtn).isSelected();
    }

    public void clickOnRadioButtons(){
        clickRadioBtn();
        clickYesBtn();
        clickImpressiveBtn();
    }
}

