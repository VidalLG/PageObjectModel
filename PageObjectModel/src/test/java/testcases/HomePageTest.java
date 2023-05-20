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

public class HomePageTest extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;
    TestUtil testUtil;
    ContactsPage contactsPage;

    public HomePageTest(){
        super();
    }

    @BeforeTest
    public void setUp () throws InterruptedException {
        initialization();
        testUtil = new TestUtil();
        contactsPage = new ContactsPage();
        loginPage = new LoginPage();
        homePage = loginPage.login(properties.getProperty("userName"), properties.getProperty("password"));

    }

    @Test (priority = 1)
    public void verifyHomePageTitle(){
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page title not matched");

    }

    @Test(priority = 2)
    public void verifyUserName(){
        Assert.assertTrue(homePage.verifyCorrectUserName());
    }

    @Test(priority = 3)
    public void verifyContactsButton() throws InterruptedException {
        contactsPage = homePage.clickOnContactsButton();
        Thread.sleep(3000);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        driver.close();

    }


}
