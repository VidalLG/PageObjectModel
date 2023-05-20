package Orange.Util;

import Orange.Base.BaseTest;
import org.openqa.selenium.WebElement;

public class Actions extends BaseTest {

    public void InpuFill(WebElement element, String data){
        element.clear();
        element.sendKeys();
    }




}
