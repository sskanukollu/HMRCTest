package pagesobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class AuthenticationPage extends TestBase {

    //Initilize Page Objects
    public AuthenticationPage(){
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//*[@id=\"email_create\"]")
    WebElement email;

    @FindBy(xpath="//*[@id=\"SubmitCreate\"]")
    WebElement createAccountBtn;

    @FindBy(xpath="//*[@id=\"email\"]")
    WebElement existingEmail;

    @FindBy(xpath="//*[@id=\"passwd\"]")
    WebElement password;

    @FindBy(xpath="//*[@id=\"SubmitLogin\"]")
    WebElement signInBtn;

    public  RegistrationPage createAccount(String userEmail){
        email.sendKeys(userEmail);
        createAccountBtn.click();
        return new RegistrationPage();
    }

    public void loginToExistingAccount(String userEmail, String userPassword){
        existingEmail.sendKeys(userEmail);
        password.sendKeys(userPassword);
        signInBtn.click();
    }


}
