# HMRCTest
SivaWebdriverCucumberJava

To Run the tests:
integration-test -Dbrowser=chrome -Pcucumber "-Dcucumber.options=--tags @Regression --format  html:target/cucumber/  --format  json:target/cucumber/cucumber.json"

Created framework to test Chrome, Firefox and IE browsers on Mac, Windows and Linux(for Jenkins CI)
To select the browser : -Dbrowser=xxxxx
To select OS: Based on the machine we run the tests, script sets the corresponding drivers runtime. No need to pass OS param.

Used Cucumber BDD features
Java 8
Page Object Model with Page Factory.

Observations:
Cart value is refreshed to empty after logout and login back.  This test is failed.
