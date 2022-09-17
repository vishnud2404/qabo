package actions;

import elements.QABO_Home_Page;
import org.openqa.selenium.WebDriver;
import stepDefinition.Common_Steps;

public class QABO_Home_Page_Actions {
    public WebDriver driver;

    QABO_Home_Page home_elements;

    public QABO_Home_Page_Actions(Common_Steps common_steps) {
        this.driver = common_steps.getDriver();
        home_elements = new QABO_Home_Page(driver);
    }

    public void enterUserName(String user) {
        home_elements.uname.sendKeys(user);
    }

    public void enterPassword(String entrPassword) {
        home_elements.upwd.sendKeys(entrPassword);
    }

    public void login() {
        home_elements.btn.click();
    }
}
