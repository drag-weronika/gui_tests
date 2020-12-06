$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registration.feature");
formatter.feature({
  "line": 2,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@registration"
    }
  ]
});
formatter.before({
  "duration": 8738598600,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Fill invalid registration data",
  "description": "",
  "id": "registration;fill-invalid-registration-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@invalidEmail"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I navigate to last.fm registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter email with invalid format",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I see alert message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.i_navigate_to_last_fm_registration_page()"
});
formatter.result({
  "duration": 24531038200,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_enter_email_with_invalid_format()"
});
formatter.result({
  "duration": 157115500,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_see_alert_message_displayed()"
});
formatter.result({
  "duration": 79828000,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat steps.RegistrationSteps.i_see_alert_message_displayed(RegistrationSteps.java:43)\r\n\tat ✽.Then I see alert message displayed(registration.feature:8)\r\n",
  "status": "failed"
});
formatter.write("JS console logs \u003c\n2020-12-06T17:33:38.640 entry.getLevel() entry.getMessage()/2020-12-06T17:33:38.890 entry.getLevel() entry.getMessage()/2020-12-06T17:33:39.137 entry.getLevel() entry.getMessage()/ \u003e\n");
formatter.after({
  "duration": 19825700,
  "status": "passed"
});
});