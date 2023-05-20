package Orange.Pages;

import Orange.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BaseTest {
    @FindBy (xpath = "//span[text()='Create New Contact']")
    WebElement labelContacts;

    @FindBy(name = "first_name")
    WebElement firsName;

    @FindBy(name = "last_name")
    WebElement lastName;

    @FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
    WebElement company;

    @FindBy(xpath = "//i[@class= 'save icon']")
    WebElement save;

    //Inicializamos

    public ContactsPage(){
        PageFactory.initElements(driver, this);

    }

    public boolean verifyContactsLabel(){
        return labelContacts.isDisplayed();
    }

    public void createNewContact(String fName, String lName, String compa) throws InterruptedException {
        firsName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(compa);
        Thread.sleep(1000);
        save.click();
        Thread.sleep(3000);


    }




}
