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
  "duration": 3839334889,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.submitTheUserDataForRegistration()"
});
formatter.result({
  "duration": 397628085,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.userShouldBeCreatedWithConfirmationMessage()"
});
formatter.result({
  "duration": 3412560546,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.myAccountPageShouldDisplayUserName()"
});
formatter.result({
  "duration": 1387621286,
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
  "duration": 4339149601,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 49311,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1592567429,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.userShouldLoginSuccessfully()"
});
formatter.result({
  "duration": 1436785625,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Search for an expensive dress",
  "description": "",
  "id": "verify-yourlogo-website-functionality;search-for-an-expensive-dress",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@ExpensiveDress"
    },
    {
      "line": 18,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Provided the existing user login details",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "tried to login with provided credentials",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Search for an expensive dress",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Able to add it to Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 3728480038,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 33028,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1410118056,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.searchForAnExpensiveDress()"
});
formatter.result({
  "duration": 1853930156,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.ableToAddItToCart()"
});
formatter.result({
  "duration": 168302545,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Logback and check the cart",
  "description": "",
  "id": "verify-yourlogo-website-functionality;logback-and-check-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@ExpensiveDress"
    },
    {
      "line": 27,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "A practice website is up and running",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "Provided the existing user login details",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "tried to login with provided credentials",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "the cart has saved things after logout and Login",
  "keyword": "Then "
});
formatter.match({
  "location": "YourLogoStepDefs.aPracticeWebsiteIsUpAndRunning()"
});
formatter.result({
  "duration": 2895967252,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.providedTheExistingUserLoginDetails()"
});
formatter.result({
  "duration": 24234,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.triedToLoginWithProvidedCredentials()"
});
formatter.result({
  "duration": 1470446964,
  "status": "passed"
});
formatter.match({
  "location": "YourLogoStepDefs.theCartHasSavedThingsAfterLogoutAndLogin()"
});
formatter.result({
  "duration": 541186,
  "error_message": "java.lang.NullPointerException\n\tat cucumber.stepdef.YourLogoStepDefs.theCartHasSavedThingsAfterLogoutAndLogin(YourLogoStepDefs.java:100)\n\tat ✽.Then the cart has saved things after logout and Login(YourLogo.feature:32)\n",
  "status": "failed"
});
});