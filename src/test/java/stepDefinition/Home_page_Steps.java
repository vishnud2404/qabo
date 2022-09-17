package stepDefinition;

import actions.Common_Actions;
import actions.QABO_Home_Page_Actions;
import io.cucumber.java.en.*;

public class Home_page_Steps {

    Common_Actions ca;
    QABO_Home_Page_Actions pa;

    public Home_page_Steps(Common_Actions ca, QABO_Home_Page_Actions pa) {
        this.ca = ca;
        this.pa = pa;
    }


    @Given("User On Home Page")
    public void user_on_home_page() {
        ca.goToUrl("https://qabo.scivalcontent.com/Account/LogOn");

    }

    @When("Enter The UserName {string} And Password {string}")
    public void enter_the_user_name_devteamvd_and_password(String username, String password) {
        pa.enterUserName(username);
        pa.enterPassword(password);

    }

    @Then("Enter The Click Button")
    public void enter_the_click_button() {
        pa.login();

    }


}
