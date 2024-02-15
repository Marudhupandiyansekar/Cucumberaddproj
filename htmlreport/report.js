$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/Sample.feature");
formatter.feature({
  "name": "",
  "description": "       To validate the facebook login page",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "        To validate valid username and invalid password",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the ChromeBrowser and launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.to_launch_the_ChromeBrowser_and_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the valid username in email field",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.to_validate_the_valid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To validate the invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_validate_the_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.to_click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.to_Close_the_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "",
  "description": " To verify invalid username and invalid password",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "To start chrome browser and hit the url",
  "keyword": "Given "
});
formatter.step({
  "name": "To verify invalid username \"\u003cUsername\u003e\" in email box",
  "keyword": "When "
});
formatter.step({
  "name": "To verify invalid password in \"\u003cPassword\u003e\" password box",
  "keyword": "And "
});
formatter.step({
  "name": "To press login button",
  "keyword": "And "
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "marudhu@gmail.com",
        "marudhu14"
      ]
    },
    {
      "cells": [
        "abc@gmail.com",
        "by123"
      ]
    },
    {
      "cells": [
        "laptop123@gmail.com",
        "dell"
      ]
    },
    {
      "cells": [
        "samusnggalaxy@gmail.com",
        "galaxya30"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": " To verify invalid username and invalid password",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To start chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbPosNeg.toStartChromeBrowserAndHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid username \"marudhu@gmail.com\" in email box",
  "keyword": "When "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidUsernameInEmailBox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid password in \"marudhu14\" password box",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidPasswordInPasswordBox(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FbPosNeg.toVerifyInvalidPasswordInPasswordBox(FbPosNeg.java:30)\r\n\tat ✽.To verify invalid password in \"marudhu14\" password box(C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/Sample.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To press login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toPressLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbPosNeg.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": " To verify invalid username and invalid password",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To start chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbPosNeg.toStartChromeBrowserAndHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid username \"abc@gmail.com\" in email box",
  "keyword": "When "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidUsernameInEmailBox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid password in \"by123\" password box",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidPasswordInPasswordBox(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FbPosNeg.toVerifyInvalidPasswordInPasswordBox(FbPosNeg.java:30)\r\n\tat ✽.To verify invalid password in \"by123\" password box(C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/Sample.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To press login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toPressLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbPosNeg.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": " To verify invalid username and invalid password",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To start chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbPosNeg.toStartChromeBrowserAndHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid username \"laptop123@gmail.com\" in email box",
  "keyword": "When "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidUsernameInEmailBox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid password in \"dell\" password box",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidPasswordInPasswordBox(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FbPosNeg.toVerifyInvalidPasswordInPasswordBox(FbPosNeg.java:30)\r\n\tat ✽.To verify invalid password in \"dell\" password box(C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/Sample.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To press login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toPressLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbPosNeg.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": " To verify invalid username and invalid password",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To start chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbPosNeg.toStartChromeBrowserAndHitTheUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid username \"samusnggalaxy@gmail.com\" in email box",
  "keyword": "When "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidUsernameInEmailBox(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify invalid password in \"galaxya30\" password box",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toVerifyInvalidPasswordInPasswordBox(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.FbPosNeg.toVerifyInvalidPasswordInPasswordBox(FbPosNeg.java:30)\r\n\tat ✽.To verify invalid password in \"galaxya30\" password box(C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/Sample.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To press login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbPosNeg.toPressLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbPosNeg.toCloseTheChromeBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/amazon.feature");
formatter.feature({
  "name": "",
  "description": "To validate functionality of amazon signin page",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "To validate valid username and invalid password",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Amazon.toLaunchTheChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter valid username in email field",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon.toEnterValidUsernameInEmailField()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.Amazon.toEnterValidUsernameInEmailField(Amazon.java:27)\r\n\tat ✽.To enter valid username in email field(C:/Users/welcome/eclipse-workspace3/Cucumber/src/test/resources/Testing/amazon.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toClickTheContinueButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To enter invalid password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toEnterInvalidPasswordInPasswordField()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To click the the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.toClickTheTheSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the  browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon.toCloseTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});