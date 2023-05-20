package Orange.Pages;

import Orange.Base.BaseTest;
import Orange.Util.Actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    //Actions actions = new Actions();

    //Locator boton username
    @FindBy(name = "email")
    WebElement userName;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//div[@class = 'ui fluid large blue submit button']")
    WebElement submit;

    @FindBy(xpath = "//a[text()='Forgot your password?']")
    WebElement forgot;

    @FindBy(xpath = "//a[text()='Sign Up']")
    WebElement signUp;

    //Inicializar los objetos de la pagina
    public LoginPage(){
        PageFactory.initElements(driver,this);

    }

    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateLoginBotton(){
        return submit.isDisplayed();
    }

    public HomePage login (String us, String pwd) throws InterruptedException {

        //actions.InpuFill(userName, us);
        //actions.InpuFill(password, pwd);
        userName.sendKeys(us);
        password.sendKeys(pwd);
        submit.click();
        Thread.sleep(3000);

        return new HomePage();
    }










}
