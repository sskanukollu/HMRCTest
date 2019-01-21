$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YourLogo.feature");
formatter.feature({
  "line": 1,
  "name": "Verify YourLogo website functionality",
  "description": "",
  "id": "verify-yourlogo-website-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create a new account",
  "description": "",
  "id": "verify-yourlogo-website-functionality;create-a-new-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@NewAccount"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Submit the user data for registration",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be created with confirmation message",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "My account page should display user name",
  "keyword": "And "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 3745180415,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.submitTheUserDataForRegistration()"
});
formatter.result({
  "duration": 376185776,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.userShouldBeCreatedWithConfirmationMessage()"
});
formatter.result({
  "duration": 3299482796,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.myAccountPageShouldDisplayUserName()"
});
formatter.result({
  "duration": 1554225516,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login with existing user details",
  "description": "",
  "id": "verify-yourlogo-website-functionality;login-with-existing-user-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@ExistingUser"
    },
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Provided the existing user login details",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "tried to login with provided credentials",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 4414114495,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 58308,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1326933880,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.userShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 1228082349,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search for an expensive dress",
  "description": "",
  "id": "verify-yourlogo-website-functionality;search-for-an-expensive-dress",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@ExpensiveDress"
    },
    {
      "line": 17,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Provided the existing user login details",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "tried to login with provided credentials",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Search for an expensive dress",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Able to add it to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 3097377014,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 34168,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1604671113,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.searchForAnExpensiveDress()"
});
formatter.result({
  "duration": 6112560576,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.ableToAddItToCart()"
});
formatter.result({
  "duration": 150782953,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Logback and check the cart",
  "description": "",
  "id": "verify-yourlogo-website-functionality;logback-and-check-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Cart"
    },
    {
      "line": 25,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "Provided the existing user login details",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "tried to login with provided credentials",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "the cart has saved things after logout and Login",
  "keyword": "Then "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 2895750547,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 34407,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1856573553,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.theCartHasSavedThingsAfterLogoutAndLogin()"
});
formatter.result({
  "duration": 104614458,
  "error_message": "java.lang.AssertionError: Cart does not retain saved products did not expect to find [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.failNotEquals(Assert.java:969)\n\tat org.testng.Assert.assertTrue(Assert.java:43)\n\tat cucumber.stepdef.YourLogoStepDefs.theCartHasSavedThingsAfterLogoutAndLogin(YourLogoStepDefs.java:103)\n\tat ✽.Then the cart has saved things after logout and Login(YourLogo.feature:30)\n",
  "status": "failed"
});
});