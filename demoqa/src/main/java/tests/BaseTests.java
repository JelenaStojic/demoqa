package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import elements.*;

import java.time.Duration;

public class BaseTests {
    private WebDriver driver;
    private WebDriverWait driverWait;
    private Actions actions;
    private HomePage homePage;
    private TextBox textBox;
    private RadioButton radioButton;
    private Buttons buttons;
    private WebTables webTables;
    private CheckBox checkBox;
    private LinksPage linksPage;
    private BrokenLinksImages brokenLinksImages;
    private DynamicProperties dynamicProperties;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getDriverWait() {
        return driverWait;
    }

    public Actions getActions() {
        return actions;
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public TextBox getTextBox() {
        return textBox;
    }
    public RadioButton getRadioButton(){
        return radioButton;
    }
    public Buttons getButtons(){return buttons;}

    public WebTables getWebTables(){return webTables;}
    public CheckBox getCheckBox(){return checkBox;}
    public LinksPage getLinksPage(){return linksPage;}
    public BrokenLinksImages getBrokenLinksImages(){return brokenLinksImages;}
    public DynamicProperties getDynamicProperties(){return dynamicProperties;}


    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ThinkPad\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
        actions = new Actions(driver);
        homePage = new HomePage(driver,driverWait,actions);
        textBox = new TextBox(driver,driverWait, actions);
        checkBox = new CheckBox(driver,driverWait, actions);
        radioButton = new RadioButton(driver,driverWait, actions);
        buttons = new Buttons(driver,driverWait, actions);
        webTables = new WebTables(driver,driverWait, actions);
        linksPage = new LinksPage(driver, driverWait, actions);
        brokenLinksImages = new BrokenLinksImages(driver, driverWait, actions);
        dynamicProperties = new DynamicProperties(driver, driverWait, actions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.navigate().to("https://demoqa.com/");
    }

    @BeforeMethod
    public void beforeMethod() {
        homePage.headerClick();
    }

    @AfterClass
    public void afterClass(){
        driver.close();
    }
}

