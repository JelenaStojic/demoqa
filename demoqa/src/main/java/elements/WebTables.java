package elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables extends BasePage {

    public WebTables(WebDriver driver, WebDriverWait driverWait, Actions actions) {
        super(driver, driverWait, actions);
    }

    private By addBtn = By.id("addNewRecordButton");
    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By email = By.id("userEmail");
    private By age = By.id("age");
    private By salary = By.id("salary");
    //   private By salary = By.xpath("//*[@id=\"salary\"]");
    private By department = By.id("department");
    private By submitBtn = By.id("submit");
    private By webTables = By.xpath("//*[@id=\"item-3\"]");
    private By deleteEntry = By.xpath("//*[contains(@title,\'Delete\')]");
    //*[@id="delete-record-2"]/svg
    //*[@id="delete-record-4"]/svg/path
    private By searchBox = By.id("searchBox");
    private By newRow = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div");
    private By textResult = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[3]");

    public WebElement getWebTables() {
        return getDriver().findElement(webTables);
    }

    public WebElement getFirstname() {
        return getDriver().findElement(firstName);
    }

    public WebElement getLastName() {
        return getDriver().findElement(lastName);
    }

    public WebElement getEmail() {
        return getDriver().findElement(email);
    }

    public WebElement getAge() {
        return getDriver().findElement(age);
    }

    public WebElement getSalary() {
        return getDriver().findElement(salary);
    }

    public WebElement getDepartment() {
        return getDriver().findElement(department);
    }

    public WebElement getSubmitBtn() {
        return getDriver().findElement(submitBtn);
    }

    public WebElement getAddBtn() {
        return getDriver().findElement(addBtn);
    }

    public WebElement getSearchBox() {
        return getDriver().findElement(searchBox);
    }

    public WebElement getDeleteEntry() {
        return getDriver().findElement(deleteEntry);
    }

    public void enterFirstName(String firstName) {
        getFirstname().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastName().sendKeys(lastName);
    }

    public void enterEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void enterAge(String age) {
        getAge().sendKeys(age);
    }

    public void enterSalary(String salary) {
        getSalary().sendKeys(salary);
    }

    public void enterDepartment(String department) {
        getDepartment().sendKeys(department);
    }

    public void clickWebTables() {
        getDriver().findElement(webTables).click();
    }

    public void searchEmployee(String search) {
        getSearchBox().sendKeys(search);
    }

    public void clickDeleteEntry() {
        getDriver().findElement(deleteEntry).click();
    }

    public void addEmployee(String firstName, String lastName, String email, String age, String salary, String department) {
        clickAddBtn();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterEmail(email);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);
        clickSubmitBtn();
    }

    public String textNewRow() {
        return getDriver().findElement(newRow).getText();
    }

    public void findAndDelete(String search) {
        searchEmployee(search);
        clickDeleteEntry();
    }

    public void clickSubmitBtn() {
        getDriver().findElement(submitBtn).click();
    }

    public void clickAddBtn() {
        getDriver().findElement(addBtn).click();
    }

    public String newEmployeeText() {
        return getDriver().findElement(newRow).getText();
    }

    public String messageAfterDeleting() {
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(textResult));
        return getDriver().findElement(textResult).getText();
    }
}
