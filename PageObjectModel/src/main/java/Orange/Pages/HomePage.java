package Orange.Pages;

import Orange.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//span[contains(text(), 'JORGE GENERAL' )]")
    WebElement userNameLabel;

    @FindBy(xpath = "//i[@class='home icon']")
    WebElement homeButton;

    @FindBy(xpath = "//i[@class='calendar icon']")
    WebElement calendarButton;

    @FindBy(xpath = "//i[@class='users icon']")
    WebElement contactsButton;

    @FindBy(xpath = "//i[@class='building icon']")
    WebElement companiesButton;

    @FindBy(xpath = "(//i[@class='plus inverted icon'])[2]")
    WebElement newContact;


    //Inicializamos los objetos

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle (){
        return driver.getTitle();
    }

    public boolean verifyCorrectUserName(){
        return userNameLabel.isDisplayed();
    }

    public ContactsPage clickOnContactsButton(){
        contactsButton.click();
        return new ContactsPage();
    }

    public CalendarsPage clickOnCalendarButton(){
        calendarButton.click();
        return new CalendarsPage();
    }

    public CompaniesPage clickOnCompaniesButton(){
        companiesButton.click();
        return new CompaniesPage();
    }

    public void clickOnNewContacts(){
        Actions actions = new Actions(driver);
        actions.moveToElement(contactsButton).build().perform();
        newContact.click();

    }











}
