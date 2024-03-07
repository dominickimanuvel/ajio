$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/facebook.feature");
formatter.feature({
  "name": "fb account creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Create account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@facebookin"
    }
  ]
});
formatter.step({
  "name": "Enter the firstname values \"\u003cFirstname\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the secondname values \"\u003cLastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the mobilenumber values \"\u003cMobilenumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the password values \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the date values \"\u003cDay\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the month values \"\u003cMonth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the year values \"\u003cyear\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click the gender button and take screenshot \"\u003cFirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Click Signup button",
  "keyword": "Then "
});
formatter.step({
  "name": "Work on Brokenlinks \"https://www.facebook.com\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "Mobilenumber",
        "Password",
        "Day",
        "Month",
        "year"
      ]
    },
    {
      "cells": [
        "Dominick",
        "Dominick",
        "8899990",
        "dom@gmao",
        "22",
        "May",
        "2000"
      ]
    }
  ]
});
formatter.background({
  "name": "Fb launching function",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the Fb \"https://www.facebook.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Facebook.launch_the_fb(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click create account",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.click_create_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@facebookin"
    }
  ]
});
formatter.step({
  "name": "Enter the firstname values \"Dominick\"",
  "keyword": "When "
});
formatter.match({
  "location": "Facebook.enter_the_firstname_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the secondname values \"Dominick\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_secondname_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the mobilenumber values \"8899990\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_mobilenumber_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the password values \"dom@gmao\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_password_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the date values \"22\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_date_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the month values \"May\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_month_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the year values \"2000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.enter_the_year_values(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the gender button and take screenshot \"Dominick\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.click_the_gender_button_and_take_screenshot(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Signup button",
  "keyword": "Then "
});
formatter.match({
  "location": "Facebook.click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Work on Brokenlinks \"https://www.facebook.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Facebook.work_on_Brokenlinks(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});