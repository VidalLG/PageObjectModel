package testcases;

import Orange.Base.BaseTest;
import Orange.Pages.HomePage;
import Orange.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest (){ super();}

    @BeforeTest
    public void setUp(){
        initialization();
        loginPage = new LoginPage();

    }

    @Test(priority = 1) //darle prioridad a los TestCases
    public void bottonLogin(){
        boolean flag = loginPage.validateLoginBotton();
        Assert.assertTrue(flag);
    }

    @Test (priority = 2)
    public void loginTest() throws InterruptedException {
       homePage = loginPage.login(properties.getProperty("userName"),properties.getProperty("password") );
    }

    @AfterTest
    public void tearDown(){

        driver.quit();
        driver.close();
    }









}
