package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ElementsTests extends BaseTests {
    @Test(priority = 1)
    public void testTeXtBox() {
        getHomePage().elementsClick();
        getTextBox().clickTextBox();
        getTextBox().textBoxSubmit("Marko Markovic", "marko@gmail.com", "Nova bb", "Nova bb");
        Assert.assertEquals(getTextBox().nameSummary(),"Name:Marko Markovic");
        Assert.assertEquals(getTextBox().emailSummary(),"Email:marko@gmail.com");
        Assert.assertEquals(getTextBox().currentAddressSummary(),"Current Address :Nova bb");
        Assert.assertEquals(getTextBox().permanentAddressSummary(),"Permananet Address :Nova bb");
    }
    @Test(priority = 2)
    public void testClickOnOneCheckBox() {
        getHomePage().elementsClick();
        getCheckBox().oneClickCheck();
        Assert.assertEquals(getCheckBox().messageAfterClicking(), "You have selected :\n" + "angular");
    }

    @Test(priority = 3)
    public void testRadioButtons() {
        getHomePage().elementsClick();
        getRadioButton().clickRadioBtn();
        getRadioButton().clickYesBtn();
        Assert.assertEquals(getRadioButton().responseRadioButton(), "You have selected Yes");
        Assert.assertFalse(getRadioButton().impressiveNotSelected());
        getRadioButton().clickImpressiveBtn();
        Assert.assertEquals(getRadioButton().responseRadioButton(), "You have selected Impressive");
        Assert.assertFalse(getRadioButton().yesNotSelected());
        Assert.assertFalse(getRadioButton().isNoBtnClicable());
    }

    @Test(priority = 4)
    public void testClickOnButtons() {
        getHomePage().elementsClick();
        getButtons().clickOnButtons();
        Assert.assertEquals(getButtons().doubleClickResponse(), "You have done a double click");
        Assert.assertEquals(getButtons().getRightClickResponse(), "You have done a right click");
        Assert.assertEquals(getButtons().responseClickMe(), "You have done a dynamic click");
    }

    @Test(priority = 5)
    public void testWebTablesEntryData() {
        getHomePage().elementsClick();
        getWebTables().clickWebTables();
        getWebTables().addEmployee("Marko", "Markovic", "marko@gmail.com", "29", "10000", "Administration");
        Assert.assertEquals(getWebTables().textNewRow(), "Marko\n" + "Markovic\n" + "29\n" + "marko@gmail.com\n" + "10000\n" + "Administration");

    }

    @Test(priority = 6)
    public void testDeleteUser() {
        getHomePage().elementsClick();
        getWebTables().clickWebTables();
        getWebTables().findAndDelete("alden@example.com\n");
        Assert.assertEquals(getWebTables().messageAfterDeleting(), "No rows found");
    }
    @Test(priority = 7)
    public void testLinks(){
        getHomePage().elementsClick();
        getLinksPage().clickOnNotFoundLink();
        Assert.assertEquals(getLinksPage().messageAfterClicking(),"Link has responded with staus 404 and status text Not Found");
    }
    @Test(priority = 8)
    public void testCheckValidLink(){
        getHomePage().elementsClick();
        getBrokenLinksImages().validLink();
        Assert.assertEquals(getBrokenLinksImages().getUrl(),"https://demoqa.com/");
    }

    @Test(priority = 9)
    public void testButtonEnabledAfter5Seconds(){
        getHomePage().elementsClick();
        getDynamicProperties().visibleAfter5Seconds();
        Assert.assertTrue(getDynamicProperties().buttonVisibleAfter5Seconds());
    }
    @Test(priority = 10)
    public void testbrokenLink(){
        getHomePage().elementsClick();
        getBrokenLinksImages().brokenLink();
        Assert.assertEquals(getBrokenLinksImages().textBrokenLink(),"Status Codes\n" +
                "This page returned a 500 status code.\n" +
                "\n" +
                "For a definition and common list of HTTP status codes, go here");
    }
}
