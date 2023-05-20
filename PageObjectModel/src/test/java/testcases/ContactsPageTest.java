package testcases;

import Orange.Base.BaseTest;
import Orange.Pages.ContactsPage;
import Orange.Pages.HomePage;
import Orange.Pages.LoginPage;
import Orange.Util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContactsPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ContactsPage contactsPage;

    public ContactsPageTest(){//constructor
        super();
    }

    @BeforeTest
    public void setUp () throws InterruptedException {//lo que hara el chrome antes de realizar la prueba
        initialization();
        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage();
        homePage = loginPage.login(properties.getProperty("userName"), properties.getProperty("password"));
        homePage.clickOnNewContacts();


    }

    @Test(priority = 1)
    public void verifyContactsLabel(){
        Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is beautiful");
    }

    @Test(priority = 2)
    public void createNewContact() throws InterruptedException {
        contactsPage.createNewContact("Cristiano", "Ronaldo", "America"); //pasar parametros en la prueba los cuales se definen en ContactsPage.java y aqui en el test


    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        driver.close();

    }





}
