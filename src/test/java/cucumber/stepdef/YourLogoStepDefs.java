package cucumber.stepdef;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pagesobjects.AuthenticationPage;
import pagesobjects.DressPage;
import pagesobjects.MyAccountPage;
import pagesobjects.RegistrationPage;
import utils.TestBase;

import java.sql.SQLOutput;
import java.util.UUID;


public class YourLogoStepDefs extends TestBase{

    AuthenticationPage authenticationPage;
    RegistrationPage registrationPage;
    MyAccountPage myAccountPage;
    DressPage dressPage;
    String savedCartInfo ="";

    public static  String generatedEmail = "";
    String existingEmail;
    String password;
    String savedCart="";


    public YourLogoStepDefs(){
            scenario = getScenario();
    }

    @Given("^A practice website is up and running$")
    public void aPracticeWebsiteIsUpAndRunning() throws Throwable {
        authenticationPage = TestBase.initiateApplication();
    }

    @When("^Submit the user data for registration$")
    public void submitTheUserDataForRegistration() throws Throwable {
        generatedEmail = "testEmail"+ UUID.randomUUID() + "@yopmail.com";
        authenticationPage = new AuthenticationPage();
        System.out.println(generatedEmail);
        registrationPage = authenticationPage.createAccount(generatedEmail);
    }

    @Then("^User should be created with confirmation message$")
    public void userShouldBeCreatedWithConfirmationMessage() throws Throwable {
        registrationPage = new RegistrationPage();
        registrationPage.register();
    }

    @And("^My account page should display user name$")
    public void myAccountPageShouldDisplayUserName() throws Throwable {
        myAccountPage = new MyAccountPage();
        String userName = myAccountPage.logout();
        Assert.assertEquals("TestFirst TestLast",userName );
        tearDown();
        System.out.println(userName);
    }

    @And("^Provided the existing user login details$")
    public void providedTheExistingUserLoginDetails() throws Throwable {
        if (generatedEmail == ""){
            existingEmail = properties.getProperty("existingEmail");
        } else existingEmail = generatedEmail;
        password = properties.getProperty("password");
    }

    @When("^tried to login with provided credentials$")
    public void triedToLoginWithProvidedCredentials() throws Throwable {
        authenticationPage.loginToExistingAccount(existingEmail, password);
    }

    @Then("^User should login successfully$")
    public void userShouldLoginSuccessfully() throws Throwable {
        myAccountPage = new MyAccountPage();
        String userName = myAccountPage.logout();
        Assert.assertEquals("TestFirst TestLast",userName );
        tearDown();
        System.out.println(userName);
    }

    @And("^Search for an expensive dress$")
    public void searchForAnExpensiveDress() throws Throwable {
        dressPage = new DressPage();
        dressPage.addToCart();
    }

    @Then("^Able to add it to Cart$")
    public void ableToAddItToCart() throws Throwable {
        savedCart = dressPage.cartInfo();
        tearDown();
    }

    @Then("^the cart has saved things after logout and Login$")
    public void theCartHasSavedThingsAfterLogoutAndLogin() throws Throwable {
        tearDown();
        Assert.assertTrue("1 product".equals("empty"), "Cart does not retain saved products");
    }
}
