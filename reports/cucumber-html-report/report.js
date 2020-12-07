$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 3,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    },
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 5412762300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Login with invalid password",
  "description": "",
  "id": "login;login-with-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC002"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to last.fm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I set email",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I set invalid password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see alert displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_navigate_to_last_fm_login_page()"
});
formatter.result({
  "duration": 7462590700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_set_email()"
});
formatter.result({
  "duration": 536433900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_set_password()"
});
formatter.result({
  "duration": 545249600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_submit_button()"
});
formatter.result({
  "duration": 2083887300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_should_see_alert_displayed()"
});
formatter.result({
  "duration": 3065344200,
  "status": "passed"
});
formatter.after({
  "duration": 120900,
  "status": "passed"
});
formatter.uri("registration.feature");
formatter.feature({
  "line": 3,
  "name": "Registration",
  "description": "",
  "id": "registration",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    },
    {
      "line": 2,
      "name": "@registration"
    }
  ]
});
formatter.before({
  "duration": 1313300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Fill invalid registration data",
  "description": "",
  "id": "registration;fill-invalid-registration-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@TC02"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I navigate to last.fm registration page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter email with invalid format",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I see alert message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.i_navigate_to_last_fm_registration_page()"
});
formatter.result({
  "duration": 5546411100,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_enter_email_with_invalid_format()"
});
formatter.result({
  "duration": 142351400,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.i_see_alert_message_displayed()"
});
formatter.result({
  "duration": 3031951700,
  "status": "passed"
});
formatter.after({
  "duration": 51900,
  "status": "passed"
});
});