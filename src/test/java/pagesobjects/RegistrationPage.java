package pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.TestBase;

public class RegistrationPage extends TestBase {

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }

        //Registration Page
        @FindBy(xpath = "//*[@id=\"customer_firstname\"]")
        WebElement firstName;

        @FindBy(xpath = "//*[@id=\"customer_lastname\"]")
        WebElement lastName;

        @FindBy(xpath="//*[@id=\"passwd\"]")
        WebElement password;

        @FindBy(xpath="//*[@id=\"days\"]")
        WebElement day;

        @FindBy(xpath="//*[@id=\"months\"]")
        WebElement month;

        @FindBy(xpath="//*[@id=\"years\"]")
        WebElement year;

        @FindBy(xpath="//*[@id=\"address1\"]")
        WebElement address;

        @FindBy(xpath="//*[@id=\"city\"]")
        WebElement city;

        @FindBy(xpath="//*[@id=\"id_state\"]")
        WebElement state;


        @FindBy(xpath="//*[@id=\"postcode\"]")
        WebElement postcode;

        @FindBy(xpath="//*[@id=\"id_country\"]")
        WebElement country;

        @FindBy(xpath="//*[@id=\"phone_mobile\"]")
        WebElement mobilePhone;

        @FindBy(xpath="//*[@id=\"alias\"]")
        WebElement reference;

        @FindBy(xpath="//*[@id=\"submitAccount\"]")
        WebElement register;


    public MyAccountPage register(){
        firstName.sendKeys("TestFirst");
        lastName.sendKeys("TestLast");
        password.sendKeys("Password123");
        day.sendKeys("14");
        month.sendKeys("March");
        year.sendKeys("1980");
        address.sendKeys("14 Jersey Road");
        city.sendKeys("New York");
        state.sendKeys("New York");
        country.sendKeys("United States");
        postcode.sendKeys("32479");
        mobilePhone.sendKeys("07540555666");
        reference.sendKeys("Home Address1");
        register.click();
        return new MyAccountPage();
    }

}