
package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox extends BasePage{
    private By textBox = By.id("item-0");
    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
//    private By outputMessage = By.xpath("//*[@id=\"output\"]/div");


    public TextBox(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    public WebElement getTextBox() {return getDriver().findElement(textBox);}

    public WebElement getFullName() {return getDriver().findElement(fullName);}

    public WebElement getEmail() {return getDriver().findElement(email);}


    public WebElement getCurrentAddress() {return getDriver().findElement(currentAddress);}

    public WebElement getPermanentAddress() {return getDriver().findElement(permanentAddress);}

    public WebElement getSubmitBtn() {return getDriver().findElement(submitBtn);}


    public void enterFullName(String name){getFullName().sendKeys(name);}

    public void enterEmail(String userEmail){getEmail().sendKeys(userEmail);}

    public void enterCurrentAddress(String usersCurrentAddress){getCurrentAddress().sendKeys(usersCurrentAddress);};

    public void enterPermanentAddress(String usersPermanentAddress){getPermanentAddress().sendKeys(usersPermanentAddress);};


    public void clickTextBox(){
        getDriver().findElement(textBox).click();
    }

    public void textBoxSubmit(String fullName, String email, String currentAddress, String permanentAddress){

        enterFullName(fullName);
        enterEmail(email);
        enterCurrentAddress(currentAddress);
        enterPermanentAddress(permanentAddress);
        clickSubmitBtn();
    }
    public void clickSubmitBtn(){
        getDriver().findElement(submitBtn).click();
    }

    public String nameSummary(){
        return getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[1]")).getText();
    }

    public String emailSummary(){
        return getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[2]")).getText();
    }

    public String currentAddressSummary(){
        return getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]")).getText();
    }

    public String permanentAddressSummary(){
        return getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]")).getText();
    }



}

