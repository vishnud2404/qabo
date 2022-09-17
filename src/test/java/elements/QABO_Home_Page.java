package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QABO_Home_Page {
WebDriver driver;
public QABO_Home_Page(WebDriver driver){
this.driver=driver;
    PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//input[@id='UserName']") public WebElement uname;

@FindBy(xpath = "//input[@id='Password']") public WebElement upwd;

@FindBy(xpath = "//input[@type='submit']") public WebElement btn;

}
