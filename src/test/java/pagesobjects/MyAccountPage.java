package pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class MyAccountPage extends TestBase {

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    WebElement loggedInUserName;

    @FindBy(xpath="/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    WebElement logOutLink;

    public String logout(){
        String userName= loggedInUserName.getText();
        logOutLink.click();
        return userName;
    }
}
