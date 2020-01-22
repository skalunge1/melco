$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 2,
  "name": "Home Screen",
  "description": "",
  "id": "home-screen",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomeScreen"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Melco Android Login",
  "description": "",
  "id": "home-screen;melco-android-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@HomeScreenDetails"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I land on Melco app home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign up the app using \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I land on Home screen successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "home-screen;melco-android-login;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "home-screen;melco-android-login;;1"
    },
    {
      "cells": [
        "3944785",
        "1234"
      ],
      "line": 12,
      "id": "home-screen;melco-android-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Melco Android Login",
  "description": "",
  "id": "home-screen;melco-android-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@HomeScreen"
    },
    {
      "line": 4,
      "name": "@HomeScreenDetails"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I land on Melco app home screen",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I sign up the app using \"3944785\" and \"1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I land on Home screen successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.i_land_on_Melco_app_home_screen()"
});
formatter.result({
  "duration": 53110916597,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3944785",
      "offset": 25
    },
    {
      "val": "1234",
      "offset": 39
    }
  ],
  "location": "HomePageStep.i_sign_up_the_app_using_and(String,String)"
});
formatter.result({
  "duration": 9034045,
  "error_message": "java.lang.NullPointerException\n\tat stepDefination.HomePageStep.i_sign_up_the_app_using_and(HomePageStep.java:36)\n\tat ✽.When I sign up the app using \"3944785\" and \"1234\"(homePage.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageStep.i_land_on_Home_screen_successfully()"
});
formatter.result({
  "status": "skipped"
});
});